package com.itschool.library.utils.design_patterns.creational.prototype.example_two;

public class Document implements Cloneable {
    private String type;

    public Document(String type) {
        this.type = type;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
