package com.example.myBook.dto.respond;

import lombok.Data;

import java.util.List;

@Data
public class BookListFindAllRequestDTO {
    List<BookFindAllRequestDTO> bookFindAllRequestDTOS;
}
