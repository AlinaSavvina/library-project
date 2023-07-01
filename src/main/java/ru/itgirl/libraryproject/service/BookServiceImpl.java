package ru.itgirl.libraryproject.service;

import org.springframework.stereotype.Service;
import ru.itgirl.libraryproject.model.Book;
import ru.itgirl.libraryproject.repository.BookRepository;

import java.util.List;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService{


    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getBookByIdGenre(Long id) {
        return bookRepository.findBookByIdGenre(id);
    }

}
