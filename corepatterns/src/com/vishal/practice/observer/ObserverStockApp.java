package com.vishal.practice.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class StockMarket implements Subject {
    int stockPrice = 100;
    String stockName = "Infinite Minds";

    List<Observer> observerList = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList){
            o.update(stockName,stockPrice);
        }
    }

    public void updateStock(){
        int i = 0;
        while(i < 30){
            Random random = new Random();
            int randomNum = -10 + random.nextInt(10 - (-10) + 1);

            stockPrice = stockPrice + randomNum;

            notifyObservers();
            System.out.println("---------------------------------------------------------");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
        notifyObservers();
    }
}

interface Observer {
    void update(String stockName,int price);
}

class StockObserverA implements Observer{

    @Override
    public void update(String stockName, int price) {
        System.out.println("Observer A stockName :: "+stockName+"    stockPrice :: "+price);
    }
}

class StockObserverB implements Observer{

    @Override
    public void update(String stockName, int price) {
        System.out.println("Observer B stockName :: "+stockName+"    stockPrice :: "+price);
    }
}



public class ObserverStockApp {

    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockObserverA observerA = new StockObserverA();
        StockObserverB observerB = new StockObserverB();

        stockMarket.registerObserver(observerA);
        stockMarket.registerObserver(observerB);

        stockMarket.updateStock();
    }
}
