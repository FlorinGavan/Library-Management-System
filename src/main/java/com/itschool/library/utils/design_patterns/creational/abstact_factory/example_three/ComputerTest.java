package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_three;

public class ComputerTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("200 GB", "500 Tb", "24.4 GHz"));
        System.out.println("AbstractFactory PC Config: " + pc);
        System.out.println("AbstractFactory Server Config: " + server);
    }
}