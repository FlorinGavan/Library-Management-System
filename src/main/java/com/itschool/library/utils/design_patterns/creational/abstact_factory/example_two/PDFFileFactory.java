package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_two;

public class PDFFileFactory extends FileFactory{
    @Override
    public File createFile() {
        return new PDFFile();
    }
}
