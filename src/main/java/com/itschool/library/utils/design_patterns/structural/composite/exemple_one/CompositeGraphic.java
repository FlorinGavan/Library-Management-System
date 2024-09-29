package com.itschool.library.utils.design_patterns.structural.composite.exemple_one;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{

    private List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic){
        graphics.add(graphic);
    }
    public  void remove(Graphic graphic){
        graphics.remove(graphic);
    }

    @Override
    public void draw(){
        for (Graphic graphic:graphics){
            graphic.draw();
        }
    }
}