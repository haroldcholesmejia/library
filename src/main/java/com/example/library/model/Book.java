package com.example.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public @Data class Book {

    private String bookId;
    private String bookName;
    private String bookDescription;
    private String bookAño;
    private String bookAuthor;
    private int price;
    private int qyt;
    
    public Book(String bookId, String bookName, String bookDescription, String bookAño, String bookAuthor, int price,
            int qyt) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.bookAño = bookAño;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.qyt = qyt;
    }
    
   

}
