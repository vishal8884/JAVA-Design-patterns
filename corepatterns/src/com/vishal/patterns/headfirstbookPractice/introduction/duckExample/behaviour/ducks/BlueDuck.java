package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks;

import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.fly.CannotFly;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.quack.NoQuack;

public class BlueDuck extends Duck{

    public BlueDuck() {
        flyingBehavior = new CannotFly();
        quackingBehavior = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("Displaying blue duck");
    }
}
