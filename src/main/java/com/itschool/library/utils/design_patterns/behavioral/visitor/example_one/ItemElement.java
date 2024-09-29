package com.itschool.library.utils.design_patterns.behavioral.visitor.example_one;

public interface ItemElement {

    public  int accept(ShoppingCartVisitor visitor);
}
