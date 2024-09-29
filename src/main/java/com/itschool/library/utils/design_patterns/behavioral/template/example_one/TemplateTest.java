package com.itschool.library.utils.design_patterns.behavioral.template.example_one;

public class TemplateTest {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodHouse();
        houseType.buildHouse();
        System.out.println();
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}