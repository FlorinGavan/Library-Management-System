package com.itschool.library.exceptions;

public class BookNotFoundExceptions extends RuntimeException {

    public BookNotFoundExceptions(String message) {
        super(message);
    }
}