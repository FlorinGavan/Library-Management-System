package com.itschool.library.utils.design_patterns.behavioral.chain.example_one;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency cur);
}