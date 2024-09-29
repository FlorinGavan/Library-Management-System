package com.itschool.library.utils.design_patterns.behavioral.template.example_one;

public class GlassHouse extends HouseTemplate{

    @Override
    public  void buildWalls(){
        System.out.println("Building glass walls");
    }
    @Override
    public  void buildPillars(){
        System.out.println("Building pillars with glass coating");
    }
}