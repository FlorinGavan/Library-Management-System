package com.itschool.library.utils.design_patterns.behavioral.chain.example_one;

public class Currency {
    private int amount;

    public Currency(int amt) {
        this.amount = amt;
    }

    public int getAmount() {
        return this.amount;
    }
}