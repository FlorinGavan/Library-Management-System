package com.itschool.library.utils.design_patterns.behavioral.state.example_one;

public class TVContext implements State{

    private  State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }
    @Override
    public  void doAction(){
        this.tvState.doAction();
    }
}