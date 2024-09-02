package com.example.myBook.service;

import com.example.myBook.dto.request.BookAddRequestDTO;
import com.example.myBook.dto.request.BookUpdateByIdRequestDTO;
import com.example.myBook.dto.respond.BookFindByIdRespondDTO;
import com.example.myBook.dto.respond.BookFindByNameRespondDTO;
import com.example.myBook.dto.respond.BookListFindAllRequestDTO;

public interface BookService {
    void add(BookAddRequestDTO bookAddRequestDTO);

    void update(BookUpdateByIdRequestDTO bookUpdateByIdRequestDTO);

    BookListFindAllRequestDTO findAll();

    void deleteById(Long id);

    BookFindByIdRespondDTO findById(Long id);

    BookFindByNameRespondDTO findByName(String name);

}
