package com.vishal.practice.creational.singleton;

class TrafficController {
    static TrafficController trafficController;

    private TrafficController(){
        System.out.println("Private constructor for traffic controller");
    }

    public static TrafficController getInstance(){
        if(trafficController == null){
            return new TrafficController();
        }
        return  trafficController;
    }

    public void setSignal(){
        System.out.println("Setting signal");
    }
}

class TrafficControllerAdvanced {
    static TrafficControllerAdvanced trafficControllerAdvanced;
    String signal;

    private TrafficControllerAdvanced(){
        System.out.println("Private constructor for traffic controller");
    }

    public static TrafficControllerAdvanced getInstance(){
        if(trafficControllerAdvanced == null){
            return new TrafficControllerAdvanced();
        }
        return trafficControllerAdvanced;
    }

    public void setSignal(String signal){
        this.signal = signal;
    }
    public void showSignal(){
        System.out.println("signal :: "+signal);
    }
}


public class SingletonDemo {
    public static void main(String[] args) {
        TrafficController trafficController = TrafficController.getInstance();
        trafficController.setSignal();

        ////////////////////////Own advanced demo/////////////////
        TrafficControllerAdvanced trafficControllerAdvanced = TrafficControllerAdvanced.getInstance();
        trafficControllerAdvanced.setSignal("Green");
        trafficControllerAdvanced.showSignal();

        trafficControllerAdvanced.setSignal("Red");
        trafficControllerAdvanced.showSignal();
    }
}
