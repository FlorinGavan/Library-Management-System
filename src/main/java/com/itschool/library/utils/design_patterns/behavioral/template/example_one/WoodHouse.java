package com.itschool.library.utils.design_patterns.behavioral.template.example_one;

public class WoodHouse extends HouseTemplate{

    @Override
    public  void buildWalls(){
        System.out.println("Building Wooden Walls");
    }
    @Override
    public  void buildPillars(){
        System.out.println("Building Wood Pillars");
    }
}