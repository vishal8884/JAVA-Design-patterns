package com.vishal.practice.behaviour.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

interface PaymentSystem {
    public void pay(String amount,String from,String to);
}

final class CreditCardPaymentSystem implements PaymentSystem {

    @Override
    public void pay(String amount, String from, String to) {
        System.out.println("Paying amount using credit card "+amount+"   from account :: "+from+"   to :: "+to);
    }
}

final class UpiPaymentSystem implements PaymentSystem {

    @Override
    public void pay(String amount, String from, String to) {
        System.out.println("Paying amount using upi "+amount+"   from account :: "+from+"   to :: "+to);
    }
}

final class DebitCardPaymentSystem implements PaymentSystem {

    @Override
    public void pay(String amount, String from, String to) {
        System.out.println("Paying amount using Debit Card "+amount+"   from account :: "+from+"   to :: "+to);
    }
}


class PaymentStrategy {
    PaymentSystem paymentSystem;

    public void setPaymentSystem(PaymentSystem paymentSystem){
        this.paymentSystem = paymentSystem;
    }


    public void pay(String amount,String from,String to){
        amount = applyOffers(amount);
        //if you observe this is common accross all the implementations if we want to cahnge the offer accross all the types of payment we can do here.
        //Lets say tomorrow instead of 2 you want to give offer of 5 then you can just come and change here instead of chaing all the implementation

        paymentSystem.pay(amount,from,to);
    }

    public static String applyOffers(String amount){
        return String.valueOf(Integer.parseInt(amount) + 2);
    }
}

public class StrategyDemo {
    public static void main(String[] args) {
        //introducing paymentStragey
        String paymentStrategyStr = getPaymentStrategy();
        PaymentStrategy paymentStrategy = new PaymentStrategy();

        if("upi".equals(paymentStrategyStr)){
            paymentStrategy.setPaymentSystem(new UpiPaymentSystem());
            paymentStrategy.pay("877","accountX","accountD");
        }
        else if("creditCard".equals(paymentStrategyStr)){
            paymentStrategy.setPaymentSystem(new CreditCardPaymentSystem());
            paymentStrategy.pay("100","accountA","accountb");
        }
        else {
            paymentStrategy.setPaymentSystem(new DebitCardPaymentSystem());
            paymentStrategy.pay("1002","accountA","accountb");
        }

        //Normal interface impl creation and paying
//        PaymentSystem paymentSystem = new CreditCardPaymentSystem();
//        paymentSystem.pay("98","accountGG","accountH");


    }

    public static String getPaymentStrategy(){
        List<String> list = Arrays.asList("upi", "creditCard", "debitCard");
        int pos = new Random().nextInt(3);
        return list.get(pos);
    }
}
