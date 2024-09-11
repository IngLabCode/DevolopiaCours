package com.example.librarian.controller;

import com.example.librarian.dto.request.BookAddRequestDTO;
import com.example.librarian.dto.respond.BookFindAllListRespondDTO;
import com.example.librarian.dto.respond.BookFindAllRespondDTO;
import com.example.librarian.service.inter.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

//controller
@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/add")
    public void add(@RequestBody BookAddRequestDTO bookAddRequestDTO) {
        bookService.addBook(bookAddRequestDTO);
    }

    @GetMapping("/findall")
    public BookFindAllListRespondDTO findAll() {
        return bookService.findAll();
    }
}
