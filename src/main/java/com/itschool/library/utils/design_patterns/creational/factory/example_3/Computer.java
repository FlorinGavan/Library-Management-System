package com.itschool.library.utils.design_patterns.creational.factory.example_3;

public  abstract class Computer {

    public  abstract  String getRAM();
    public  abstract  String getHDD();
    public  abstract  String getCPU();

    @Override
    public  String toString(){
        return "RAM: "+this.getRAM()+", HDD: "+this.getHDD()+ ", CPU: "+this.getHDD();
    }
}