package com.itschool.library.utils.design_patterns.creational.prototype.example_two;

public class DocumentTest {

    public static void main(String[] args) {
        Document originalDoc = new Document("Original content");
        Document cloneDoc = originalDoc.clone();
        Document cloneDoc1 = originalDoc.clone();
        Document cloneDoc2 = originalDoc.clone();

cloneDoc2.setType("Modified Content");
        System.out.println(originalDoc.getType());
        System.out.println(cloneDoc.getType());
        System.out.println(cloneDoc1.getType());
        System.out.println(cloneDoc2.getType());
    }
}