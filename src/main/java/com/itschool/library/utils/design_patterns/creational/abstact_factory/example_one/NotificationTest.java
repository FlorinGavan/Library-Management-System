package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_one;

public class NotificationTest {

    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.notifyUser("Welcome to email");

        NotificationFactory smsFactory = new SmsNotificationFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.notifyUser("Welcome to SMS");
    }
}