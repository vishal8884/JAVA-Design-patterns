package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks;

import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.fly.CanFly;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.quack.CanQuack;

public class RedDuck extends Duck{

    public RedDuck(){
        flyingBehavior = new CanFly();
        quackingBehavior = new CanQuack();
    }

    @Override
    public void display() {
        System.out.println("Display for RedDuck");
    }
}
