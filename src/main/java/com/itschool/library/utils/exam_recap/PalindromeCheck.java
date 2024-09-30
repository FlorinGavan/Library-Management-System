package com.itschool.library.utils.exam_recap;

/*
Check Palindrome String
Write a program to check if a string is a palindrome (reads the same forward and backward).
 */

public class PalindromeCheck {

    public static void main(String[] args) {
        String input = "Hello";
        String reverse = new StringBuilder(input).reverse().toString();

        if (input.equals(reverse)) {
            System.out.println("This is a palindrome");
        }else {
            System.out.println("The input is not a palindrome");
        }
    }
}