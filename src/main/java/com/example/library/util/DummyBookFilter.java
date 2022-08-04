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

       /* bookService.addBook(new Book(null, "el señor de los anillos", "libro completo de la trilogia", "1900","J.R.R Tolkien", 500, 2));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}
        bookService.addBook(new Book(null, "el hobbit", "libro completo","1900", "J.R.R Tolkien", 200, 4));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}
        bookService.addBook(new Book(null, "harry potter y la piedra filosofal", "1900","libro completo de Harry Potter", "J.K. Rowling", 250, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}
        bookService.addBook(new Book(null, "harry potter y camara secreta", "1900","libro completo de Harry Potter", "J.K. Rowling", 250, 5));
*/
        bookService.addBook(new Book(null, "Iron Man","ORDEN CRNOLOGICO PELICULAS MARVEL", "2008", "Jon Favreau", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "el Increible Hulk","ORDEN CRNOLOGICO PELICULAS MARVEL", "2008", "Louis Leterrier", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Iron Man II","ORDEN CRNOLOGICO PELICULAS MARVEL", "2010", "Jon Favreau", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Capitan America: El primer vengador", "ORDEN CRNOLOGICO PELICULAS MARVEL", "2011", "Joe Johnston", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Thor", "ORDEN CRNOLOGICO PELICULAS MARVEL", "2011", "Kenneth Branagh", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Los Vengadores", "ORDEN CRNOLOGICO PELICULAS MARVEL", "2012", "Joss Whedon", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Iron Man III","ORDEN CRNOLOGICO PELICULAS MARVEL", "2013", "Shane Black", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Thor: El Mundo Oscuro","ORDEN CRNOLOGICO PELICULAS MARVEL", "2013", "Alan Taylor", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Capitan America: El Soldado de Invierno","ORDEN CRNOLOGICO PELICULAS MARVEL", "2014", "Anthony y Joe Russo", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Guardianes de la Galaxia","ORDEN CRNOLOGICO PELICULAS MARVEL", "2014", "James Gunn", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Vengadores: La Era de Ultrón","ORDEN CRNOLOGICO PELICULAS MARVEL", "2015", "Joss Whedon", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Ant-Man","ORDEN CRNOLOGICO PELICULAS MARVEL", "2015", "Peyton Reed", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Capitan America: Civil War","ORDEN CRNOLOGICO PELICULAS MARVEL", "2016", "Anthony y Joe Russo", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Doctor Extraño","ORDEN CRNOLOGICO PELICULAS MARVEL", "2016", "Scott Derrickson", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Guardianes de la Galaxia II","ORDEN CRNOLOGICO PELICULAS MARVEL", "2017", "James Gunn", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Spider-Man","ORDEN CRNOLOGICO PELICULAS MARVEL", "2017", "Jon Watts", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Thor-Ragnarok","ORDEN CRNOLOGICO PELICULAS MARVEL", "2017", "Taika Waititi", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Black Panther","ORDEN CRNOLOGICO PELICULAS MARVEL", "2018", "Ryan Coogler", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Ant-Man y la Avispa","ORDEN CRNOLOGICO PELICULAS MARVEL", "2018", "Peyton Reed", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Vengadores: Inifinity War","ORDEN CRNOLOGICO PELICULAS MARVEL", "2018", "Anthony y Joe Russo", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Capitana Marvel"," ORDEN CRNOLOGICO PELICULAS MARVEL","2019", "Anna Boden y Ryan Fleck", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Vengadores: Endgame"," ORDEN CRNOLOGICO PELICULAS MARVEL","2019", "Joe y Anthony Russo", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

        bookService.addBook(new Book(null, "Viuda Negra"," ORDEN CRNOLOGICO PELICULAS MARVEL","2020", "Cate Shortland", 1500, 5));
        try {  Thread.sleep(100);} catch(InterruptedException e) {}

    }
}
