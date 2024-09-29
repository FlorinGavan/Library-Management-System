package com.itschool.library.utils.design_patterns.behavioral.mediator.example_one;

public interface ChatMediator {

    public  void sendMessage(String msg, User user);
        void addUser(User user);
}
