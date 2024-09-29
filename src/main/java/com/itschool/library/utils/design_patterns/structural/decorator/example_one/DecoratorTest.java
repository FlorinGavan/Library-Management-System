package com.itschool.library.utils.design_patterns.structural.decorator.example_one;

public class DecoratorTest {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " $" + simpleCoffee.cost());
        simpleCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(simpleCoffee.getDescription() + " $" + simpleCoffee.cost());

        Coffee flatWhite = new FlatWhite();
        System.out.println(flatWhite.getDescription() + " $" + flatWhite.cost());
        flatWhite = new MilkDecorator(flatWhite);
        System.out.println(flatWhite.getDescription() + " $" + flatWhite.cost());
    }
}