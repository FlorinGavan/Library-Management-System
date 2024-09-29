package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_two;

public class FileTest {

    public static void main(String[] args) {
        FileFactory pdfFileFactory = new PDFFileFactory();
        File pdfFile = pdfFileFactory.createFile();
        pdfFile.create("PDF File Exported ");

        FileFactory xmlFactoryFile = new XMLFileFactory();
        File xmlFile = xmlFactoryFile.createFile();
        xmlFile.create("XML File Exported");
    }
}