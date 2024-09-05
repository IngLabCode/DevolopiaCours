package com.example.librarian.controller;

import com.example.librarian.dto.request.BookAddRequestDTO;
import com.example.librarian.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/add")
    public void add(@RequestBody BookAddRequestDTO bookAddRequestDTO){
        bookService.addBook(bookAddRequestDTO);
    }
}
