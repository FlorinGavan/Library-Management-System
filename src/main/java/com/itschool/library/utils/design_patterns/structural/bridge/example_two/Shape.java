package com.itschool.library.utils.design_patterns.structural.bridge.example_two;

public abstract  class Shape {
    protected  Color color;

    public Shape(Color color) {
        this.color = color;
    }
    abstract  public  void applyColor();
}
