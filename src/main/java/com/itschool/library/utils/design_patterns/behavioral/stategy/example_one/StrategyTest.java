package com.itschool.library.utils.design_patterns.behavioral.stategy.example_one;

public class StrategyTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5677", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("email@yahoo.com", "pasw213"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Rahul", "123214214", "233","12/99"));
    }
}
