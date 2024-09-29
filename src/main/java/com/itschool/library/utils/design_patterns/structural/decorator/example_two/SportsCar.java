package com.itschool.library.utils.design_patterns.structural.decorator.example_two;

public class SportsCar extends  CarDecorator{

    public SportsCar (Car c){
        super(c);
    }

    @Override
    public  void assemble(){
        super.assemble();
        System.out.println(" Adding features of Sports Car");
    }
}