package com.example.library.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component
public class DummyBookFilter {
    private final BookService bookService;

    public DummyBookFilter(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init(){

        bookService.addBook(new Book(null, "el señor de los anillos", "libro completo de la trilogia", "J.R.R Tolkien", 500, 2));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}
        bookService.addBook(new Book(null, "el hobbit", "libro completo", "J.R.R Tolkien", 200, 4));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}
        bookService.addBook(new Book(null, "harry potter y la piedra filosofal", "libro completo de Harry Potter", "J.K. Rowling", 250, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}
        bookService.addBook(new Book(null, "harry potter y camara secreta", "libro completo de Harry Potter", "J.K. Rowling", 250, 5));

    }
}
