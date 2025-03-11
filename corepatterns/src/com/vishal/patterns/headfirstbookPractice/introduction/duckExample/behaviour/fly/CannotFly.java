package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.fly;

public class CannotFly implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Duck is not flying");
    }
}
