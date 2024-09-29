package com.itschool.library.utils.design_patterns.structural.composite.exemple_one;

public class CompositeTest {

    public static void main(String[] args) {
        CompositeGraphic graphic = new CompositeGraphic();

        graphic.add(new Circle());
        graphic.add(new Square());
        graphic.draw();
    }
}