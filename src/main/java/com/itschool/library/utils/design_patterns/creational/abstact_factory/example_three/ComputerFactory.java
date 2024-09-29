package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_three;

public class ComputerFactory {

    public  static  Computer getComputer(ComputerAbstractFactory factory){
        return  factory.createComputer();
    }
}
