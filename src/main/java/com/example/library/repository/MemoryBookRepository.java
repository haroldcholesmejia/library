package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.library.model.Book;

@Repository
public class MemoryBookRepository implements BooksRepository{

    private Map<String, Book> booksMap;

    

    public MemoryBookRepository() {
        booksMap =  new HashMap<>();
    }

    @Override
    public List<Book> getAll() {
        List<Book> bookss=  new ArrayList<>();
        bookss.addAll(booksMap.values());
        return bookss;
    }

    @Override
    public Book get(String bookId) {
        return booksMap.get(bookId);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return booksMap.values().stream()
				.filter(book -> book.getBookAuthor().toLowerCase().indexOf(author.toLowerCase()) >= 0 )
        .collect(Collectors.toList());

    }

    public List<Book> findByName(String name) {
    
            return booksMap.values().stream()
            .filter(book -> book.getBookName().toLowerCase().indexOf(name.toLowerCase()) >= 0 )
            .collect(Collectors.toList());
    
        }

    @Override
    public Book save(Book book) {
        if (book.getBookId()==null){
            book.setBookId(String.valueOf(System.currentTimeMillis()));
        }
        booksMap.put(book.getBookId(), book);
        return book;
    }

    @Override
    public Book delete(String bookId) {
       return booksMap.remove(bookId);
    }

    @Override
    public List<Book> findByAño(String año) {
        // TODO Auto-generated method stub
        return booksMap.values().stream()
				.filter(book -> book.getBookAño().toLowerCase().indexOf(año.toLowerCase()) >= 0 )
        .collect(Collectors.toList());
    }

}