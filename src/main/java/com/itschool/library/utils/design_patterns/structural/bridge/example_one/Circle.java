package com.itschool.library.utils.design_patterns.structural.bridge.example_one;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing circle with " + color.fill());
    }
}