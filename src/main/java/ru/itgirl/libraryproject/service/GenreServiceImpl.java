package ru.itgirl.libraryproject.service;


import org.springframework.stereotype.Service;
import ru.itgirl.libraryproject.dto.BookWithAuthorDto;
import ru.itgirl.libraryproject.dto.GenreDto;
import ru.itgirl.libraryproject.model.Genre;
import ru.itgirl.libraryproject.repository.GenreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreServiceImpl {
    private final GenreRepository genreRepository;
    private final BookService bookService;

    public GenreServiceImpl(GenreRepository genreRepository, BookService bookService) {
        this.genreRepository = genreRepository;
        this.bookService = bookService;
    }

    public GenreDto getGenreById(Long genreId) {
        Genre genre = genreRepository.findById(genreId).orElseThrow();
        return convertToDto(genre);
    }

    private GenreDto convertToDto(Genre genre) {
         List<BookWithAuthorDto> bookDtoList = genre.getBooks()
                .stream()
                .map(book -> BookWithAuthorDto.builder()
                        .id(book.getId())
                        .bookName(book.getName())
                        .bookAuthor(book.getAuthors()
                                .stream()
                                .map(author-> {
                                    String an = author.getName();
                                    String as = author.getSurname();
                                    return an + " " + as;
                                }).collect(Collectors.joining()))
                        .build())
                 .toList();


        return GenreDto.builder()
                .id(genre.getId())
                .name(genre.getName())
                .books(bookDtoList)
                .build();
        }


}







