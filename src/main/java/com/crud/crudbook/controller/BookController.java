package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Book;
import com.crud.crudbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("get/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("save/book")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping("update/book")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("delete/book/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }

}
