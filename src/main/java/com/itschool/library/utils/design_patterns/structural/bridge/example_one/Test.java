package com.itschool.library.utils.design_patterns.structural.bridge.example_one;

public class Test {

    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.draw();

        Shape circle2 = new Circle(new Blue());
        circle2.draw();
    }
}