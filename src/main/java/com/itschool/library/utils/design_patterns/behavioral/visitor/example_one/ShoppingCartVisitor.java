package com.itschool.library.utils.design_patterns.behavioral.visitor.example_one;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
