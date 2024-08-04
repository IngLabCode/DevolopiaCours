package com.example.book27.service;

import com.example.book27.request.BookAddRequestDTO;
import com.example.book27.respond.BookListResponseDTO;
import com.example.book27.respond.BookResponseDTO;

public interface BookService {
    void add(BookAddRequestDTO bookAddRequest);

    BookListResponseDTO findAll();

    BookResponseDTO findById(Long id);

    void deleteById(Long id);
}
