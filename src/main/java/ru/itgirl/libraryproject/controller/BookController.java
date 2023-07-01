package ru.itgirl.libraryproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itgirl.libraryproject.service.BookService;
import ru.itgirl.libraryproject.service.GenreService;
import ru.itgirl.libraryproject.service.GenreServiceImpl;

public class BookController {
    private final GenreService genreService;
    private final BookService bookService;
    @Autowired
    public BookController(GenreService genreService, BookService bookService){
        this.genreService =genreService;
        this.bookService =bookService;


    }
     //@GetMapping("/{id}")

}
