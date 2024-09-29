package com.itschool.library.utils.design_patterns.structural.facade.example_two;

public class Projector {
        public void on() {
        System.out.println("Projector on");
    }

    public void wideScreenMode() {
        System.out.println("Projector in widescreen mode (16x9)");
    }

    public void off() {
        System.out.println("Projector off");
    }
}