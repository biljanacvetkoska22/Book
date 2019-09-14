package com.app.booktask.config;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(long book_id) {
        super(String.format("Book is not found with id : '%s'", book_id));
    }
}
