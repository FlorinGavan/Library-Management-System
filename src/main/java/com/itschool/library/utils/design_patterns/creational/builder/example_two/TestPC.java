package com.itschool.library.utils.design_patterns.creational.builder.example_two;

public class TestPC {

    public static void main(String[] args) {
        PC pcBuild1 = new PC.PCBuilder()
                .CPU("I5-1230")
                .storage("1Tb")
                .memory("32Gb")
                .build();

        PC pcBuild2 = new PC.PCBuilder()
                .storage("500Gb")
                .memory("12Gb")
                .build();

        System.out.println("First pc " + pcBuild1);
        System.out.println();
        System.out.println("Second pc " + pcBuild2);
    }
}
