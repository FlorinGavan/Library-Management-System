package com.itschool.library.utils.design_patterns.creational.factory.example_3;

public class TestComputer {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "16GB", "1TB", "2.6 Ghz");
        Computer server = ComputerFactory.getComputer("server", "256GB", "125TB", "10.22 Ghz");
        System.out.println("Factory PC Config: " + pc);
        System.out.println("Factory Server Config: " + server);
    }
}