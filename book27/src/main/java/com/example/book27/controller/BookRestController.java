package com.example.book27.controller;

import com.example.book27.request.BookAddRequestDTO;
import com.example.book27.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookRestController {
    private BookService bookService;
    @PostMapping
    public void add(@RequestBody BookAddRequestDTO bookAddRequestDTO){
        bookService.add(bookAddRequestDTO);
    }
}
