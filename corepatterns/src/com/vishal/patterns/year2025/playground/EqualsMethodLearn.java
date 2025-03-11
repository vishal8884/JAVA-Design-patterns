package com.vishal.patterns.year2025.playground;


import java.util.Objects;

public class EqualsMethodLearn {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Silva de");
        Employee e2 = new Employee(2,"Ronaldo");
        Employee e3 = new Employee(2,"Ronaldo2");

        String s = new String("Hello");


        boolean b1 = e2.equals(e3);

        System.out.println(b1);
    }

}
