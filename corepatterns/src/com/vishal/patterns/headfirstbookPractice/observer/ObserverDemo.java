package com.vishal.patterns.headfirstbookPractice.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
}

class WeatherDataStation implements Subject{
    List<Observer> observersList;

    int temperature;
    int humidity;
    int pressure;

    public WeatherDataStation(){
        this.observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observersList.add(observer);
        observer.update(temperature,humidity,pressure);
    }

    @Override
    public void removeObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer : observersList){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(int temperature,int humidity,int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyAllObservers();
    }
}

interface Observer {
    void update(int temperature,int humidity, int pressure);
}

class WeatherObserverA implements Observer {

    int temperature;
    int humidity;
    int pressure;



    public WeatherObserverA (){

    }

    @Override
    public void update(int temperature,int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "ObserverA{" + "temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + '}';
    }
}



public class ObserverDemo {
    public static void main(String[] args) {
        //Creating weather station
        WeatherDataStation weatherDataStation = new WeatherDataStation();
        weatherDataStation.setMeasurements(34,12,10);

        //Creating a observer
        Observer observerA = new WeatherObserverA();

        //registering the created observer to the weather station
        weatherDataStation.registerObserver(observerA);

        System.out.println("Time "+new Date()+ observerA);

        //in future it got updated as measurements of weatherDataStation got updated
        weatherDataStation.setMeasurements(32,11,17);
        System.out.println("Time "+new Date()+ observerA);
    }
}
