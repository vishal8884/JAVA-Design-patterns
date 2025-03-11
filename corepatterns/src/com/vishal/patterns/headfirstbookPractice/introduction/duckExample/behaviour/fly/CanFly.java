package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.fly;

public class CanFly implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
