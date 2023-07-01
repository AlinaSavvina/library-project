package ru.itgirl.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itgirl.libraryproject.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    //List<Book> findByGenre(Genre genre);

    @Query("SELECT book.id, book.name FROM Book book WHERE book.genre.id = ?1")
    List<Book> findBookByIdGenre(Long id);
}


