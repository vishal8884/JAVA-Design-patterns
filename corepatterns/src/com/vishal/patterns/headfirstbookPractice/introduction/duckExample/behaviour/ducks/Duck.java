package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks;

import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.fly.FlyingBehavior;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.quack.QuackingBehavior;

public abstract class Duck {

    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;

    public Duck(){

    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks can swim");
    }

    public void fly(){
        flyingBehavior.fly();
    }

    public void quack(){
        quackingBehavior.quack();
    }
}
