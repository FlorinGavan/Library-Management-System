package com.itschool.library.utils.solid;

public class OCP {
}

//Before: violating OCP

class AreaCalculator {

    double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * 2;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        }
        return 0;
    }
}

interface Shape {
    double calculateArea();
}

//After: following OCP

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * 2;
    }
}

class Rectangle implements Shape {

    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class TestOCP {
    public static void main(String[] args) {
        Shape circle  = new Circle(14.2);
        circle.calculateArea();

        Shape rectangle =new Rectangle(22, 9);
        rectangle.calculateArea();

    }
}