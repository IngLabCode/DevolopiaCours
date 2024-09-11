package com.example.librarian.service.inter;

import com.example.librarian.dto.request.BookAddRequestDTO;
import com.example.librarian.dto.respond.BookFindAllListRespondDTO;
import com.example.librarian.dto.respond.BookFindAllRespondDTO;

public interface BookService {
    void addBook(BookAddRequestDTO bookAddRequestDTO);

    BookFindAllListRespondDTO findAll();

    void deleteById(Long id);
}
