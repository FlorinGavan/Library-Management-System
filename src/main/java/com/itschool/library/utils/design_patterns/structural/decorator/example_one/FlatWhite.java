package com.itschool.library.utils.design_patterns.structural.decorator.example_one;

public class FlatWhite implements Coffee{

    @Override
    public String getDescription() {
        return "FlatWhite";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
