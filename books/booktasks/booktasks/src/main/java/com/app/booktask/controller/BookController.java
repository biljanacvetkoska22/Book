package com.app.booktask.controller;

import com.app.booktask.config.BookNotFoundException;
import com.app.booktask.entity.Book;
import com.app.booktask.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * This look like router
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    /**
     * List all book from database
     * @return
     */
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    /**
     * Add a new book
     * @param book
     * @return
     */
    @PostMapping("/books")
    public Book addBook(@Valid @RequestBody Book book) {
        return bookRepository.save(book);
    }

    /**
     * Get a book by id
     * @param id
     * @return
     * @throws BookNotFoundException
     */
    @GetMapping("/books/{id}")
    public Book getBookByid(@PathVariable(value = "id") Integer id) throws BookNotFoundException {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }
}
