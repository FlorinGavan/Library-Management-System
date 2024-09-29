package com.itschool.library.utils.design_patterns.structural.composite.example_two;

public class Triangle  implements Shape{

    @Override
    public void draw(String fillColor){
        System.out.println("Drawing Triangle with color "+ fillColor);
    }
}