package com.itschool.library.utils.design_patterns.structural.adapter.example_one;

public class TurkeyAdapter implements Duck{
 private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public  void  quack(){
        turkey.gobble();
    }
}