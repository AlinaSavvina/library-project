package ru.itgirl.libraryproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.libraryproject.dto.GenreDto;
import ru.itgirl.libraryproject.service.GenreServiceImpl;

@RestController
@RequiredArgsConstructor
public class GenreController {
    private final GenreServiceImpl genreServiceImpl;

    @GetMapping("/genre/{id}")
    GenreDto getGenreById(@PathVariable("id")Long id){
        return genreServiceImpl.getGenreById(id);

    }

}
