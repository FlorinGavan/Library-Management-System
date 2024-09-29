package com.itschool.library.utils.design_patterns.creational.builder.example_two;

import lombok.Builder;

@Builder
public class PC {

    private  String CPU;
    private  String memory;
    private String storage;

    @Override
    public String toString() {
        return  "PC Specifications:\n" +
               "CPU: " + CPU + "\n" +
               "Storage: " + storage + "\n" +
               "Memory: " + memory;
    }
}
