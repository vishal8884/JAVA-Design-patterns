package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks;

import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.fly.CanFly;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.quack.CanQuack;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.quack.NoQuack;

public class PinkDuck extends Duck{

    public PinkDuck(){
        flyingBehavior = new CanFly();
        quackingBehavior = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("Display for Pink Duck");
    }
}
