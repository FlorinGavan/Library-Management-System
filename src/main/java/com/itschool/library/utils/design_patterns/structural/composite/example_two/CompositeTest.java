package com.itschool.library.utils.design_patterns.structural.composite.example_two;

public class CompositeTest {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri);
        drawing.add(cir);

        drawing.draw("RED");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("BLUE");
    }
}