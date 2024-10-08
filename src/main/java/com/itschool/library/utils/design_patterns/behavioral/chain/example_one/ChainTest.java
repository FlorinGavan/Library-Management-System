package com.itschool.library.utils.design_patterns.behavioral.chain.example_one;

import java.util.Scanner;

public class ChainTest {
    private DispenseChain c1;

    public ChainTest() {
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ChainTest atmDispenser = new ChainTest();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s");
                return;
            }
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}