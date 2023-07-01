package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.model.Book;

import java.util.List;


public interface BookService {
    List<Book> getBookByIdGenre(Long id);

}
