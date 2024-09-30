package com.itschool.library.utils.exam_recap;

/*
Count Occurrences of Character in String
Write a program that takes a string and a character as input and counts how many times that character appears in the string.
 */

public class CharacterCount {
    public static void main(String[] args) {


        String input = "Welcome to my code";
        char aChar = 'm';

        int counter = 0;

        for (char ch : input.toCharArray()) {
            if (ch == aChar) {
                counter++;
            }
        }
        System.out.println("Occurrences: " + counter);
    }
}