package com.vishal.practice.creational.factory;

interface Vehicle {
    public void performAction();
}

class Car implements Vehicle {

    @Override
    public void performAction() {
        System.out.println("Performing Action for Car");
    }
}

class Bike implements Vehicle {

    @Override
    public void performAction() {
        System.out.println("Performing Action for Bike");
    }
}


class Bus implements Vehicle {

    @Override
    public void performAction() {
        System.out.println("Performing Action for Bus");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if("car".equals(type)){
            return new Car();
        }
        else if("bike".equals(type)){
            return new Bike();
        }
        else if("bus".equals(type)){
            return new Bus();
        }
        throw new IllegalArgumentException();
    }
}


public class FactoryDemo {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.performAction();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.performAction();

    }
}
