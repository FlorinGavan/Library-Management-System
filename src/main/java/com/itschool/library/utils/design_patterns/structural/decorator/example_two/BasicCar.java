package com.itschool.library.utils.design_patterns.structural.decorator.example_two;

public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}