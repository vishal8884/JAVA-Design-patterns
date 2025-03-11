package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour;

import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks.BlueDuck;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks.Duck;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks.PinkDuck;
import com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.ducks.RedDuck;

public class DuckAppRunner {

    public static void main(String[] args) {
        Duck redDuck = new RedDuck();

        redDuck.display();
        redDuck.swim();
        redDuck.fly();
        redDuck.quack();


        Duck blueDuck = new BlueDuck();

        blueDuck.display();
        blueDuck.swim();
        blueDuck.fly();
        blueDuck.quack();


        Duck pinkDuck = new PinkDuck();

        pinkDuck.display();
        pinkDuck.swim();
        pinkDuck.fly();
        pinkDuck.quack();
    }
}
