package com.example.library.repository;

import java.util.List;

import com.example.library.model.Book;

public interface BooksRepository {

    public List<Book> getAll();
    public Book get(String bookId);
    public List<Book> findByAuthor(String author);
    public List<Book> findByName(String name);
    public List<Book> findByAño(String año);
    public Book save(Book book);
    public Book delete(String bookId);
    

    
}
