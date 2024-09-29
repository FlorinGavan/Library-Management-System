package com.itschool.library.utils.design_patterns.structural.bridge.example_one;

public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }
    abstract void draw();
}