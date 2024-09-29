package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_two;

public class PDFFile implements File{

    @Override
    public void create(String message) {
        System.out.println("PDF file created " + message);
    }
}