package com.itschool.library.utils.design_patterns.structural.adapter.example_two;

public interface SocketAdapter {

    public  Volt get120Volt();
    public  Volt get67Volt();
    public  Volt get32Volt();
}
