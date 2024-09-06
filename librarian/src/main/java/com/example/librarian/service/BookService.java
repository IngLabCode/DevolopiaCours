package com.example.librarian.service;

import com.example.librarian.dto.request.BookAddRequestDTO;
import com.example.librarian.dto.respond.BookFindAllRespondDTO;

public interface BookService {
    void addBook(BookAddRequestDTO bookAddRequestDTO);


}
