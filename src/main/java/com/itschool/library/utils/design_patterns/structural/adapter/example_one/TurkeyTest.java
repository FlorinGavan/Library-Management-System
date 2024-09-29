package com.itschool.library.utils.design_patterns.structural.adapter.example_one;

public class TurkeyTest {

    public static void main(String[] args) {
        Turkey turkey = new Turkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
    }
}