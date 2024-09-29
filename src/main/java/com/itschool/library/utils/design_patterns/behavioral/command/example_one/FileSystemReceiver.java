package com.itschool.library.utils.design_patterns.behavioral.command.example_one;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}