package com.itschool.library.utils.design_patterns.structural.adapter.example_two;

public class Socket {

    public  Volt getVolt(){
        return  new Volt(120);
    }
}
