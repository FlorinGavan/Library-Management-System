package com.itschool.library.utils.design_patterns.creational.abstact_factory.example_one;

public class SmsNotificationFactory extends  NotificationFactory{

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
