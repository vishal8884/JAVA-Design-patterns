package com.vishal.patterns.headfirstbookPractice.introduction.duckExample.behaviour.quack;

public class NoQuack implements QuackingBehavior {

    @Override
    public void quack() {
        System.out.println("Duck is not quacking");
    }
}
