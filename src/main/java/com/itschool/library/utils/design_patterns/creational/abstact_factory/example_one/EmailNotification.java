package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_one;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email with message: " + message);
    }
}
