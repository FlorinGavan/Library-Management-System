package com.itschool.library.utils.design_patterns.behavioral.stategy.example_one;

public class Item {

    private  String upCode;
    private  int price;

    public Item(String upCode, int price) {
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpCode() {
        return upCode;
    }

    public int getPrice() {
        return price;
    }
}
