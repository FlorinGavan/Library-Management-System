package com.itschool.library.utils.design_patterns.behavioral.command.example_one;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }
    public  void execute(){
        this.command.execute();
    }
}
