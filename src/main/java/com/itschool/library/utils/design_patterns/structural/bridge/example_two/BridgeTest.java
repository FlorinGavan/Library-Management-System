package com.itschool.library.utils.design_patterns.structural.bridge.example_two;

public class BridgeTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
