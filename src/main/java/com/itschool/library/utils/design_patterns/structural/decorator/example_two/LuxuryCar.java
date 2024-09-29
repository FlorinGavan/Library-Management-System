package com.itschool.library.utils.design_patterns.structural.decorator.example_two;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car c){
        super(c);
    }
    @Override
    public  void assemble(){
        super.assemble();
        System.out.println(" Assemble feature of  Luxury car");
    }
}
