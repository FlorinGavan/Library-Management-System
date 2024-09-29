package com.itschool.library.utils.design_patterns.behavioral.state.example_one;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
