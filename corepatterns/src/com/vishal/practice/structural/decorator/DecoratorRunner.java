package com.vishal.practice.structural.decorator;

interface Coffee {
    String getDescription();
    int getCost();
}

class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public int getCost() {
        return 3;
    }
}

abstract class CoffeeDecorator implements Coffee {
    Coffee coffee;

    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }
}

class MilkCoffeeDecorator extends CoffeeDecorator {

    MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",milk";
    }

    @Override
    public int getCost() {
        return super.getCost()+5;
    }
}

class WaterCoffeeDecorator extends CoffeeDecorator {
    WaterCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",water";
    }

    @Override
    public int getCost() {
        return super.getCost()+1;
    }
}

class SugarCoffeeDecorator extends CoffeeDecorator {
    SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+2;
    }
}



public class DecoratorRunner {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        //Milk coffee example
        CoffeeDecorator milkCoffeeDecorator = new MilkCoffeeDecorator(coffee);
        System.out.println(milkCoffeeDecorator.getDescription()+"    "+milkCoffeeDecorator.getCost());


        CoffeeDecorator milkSugarCoffeeDecorator = new SugarCoffeeDecorator(milkCoffeeDecorator);
        System.out.println(milkSugarCoffeeDecorator.getDescription()+"    "+milkSugarCoffeeDecorator.getCost());

       //water coffee example

        CoffeeDecorator waterCoffeeDecocator = new WaterCoffeeDecorator(coffee);
        CoffeeDecorator sugarCoffeeDecorator = new SugarCoffeeDecorator(waterCoffeeDecocator);
        System.out.println(sugarCoffeeDecorator.getDescription()+"    "+sugarCoffeeDecorator.getCost());

    }
}
