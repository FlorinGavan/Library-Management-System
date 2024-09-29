package com.itschool.library.utils.design_patterns.behavioral.mediator.example_one;

public class MediatorTest {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user = new UserImpl(mediator, "Roros");
        User user1 = new UserImpl(mediator, "Hardocan");
        User user2 = new UserImpl(mediator, "Arya");
        mediator.addUser(user);
        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hello everyone");
    }
}