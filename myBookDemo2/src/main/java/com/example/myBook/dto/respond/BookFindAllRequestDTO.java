package com.example.myBook.dto.respond;

import lombok.Data;

@Data
public class BookFindAllRequestDTO {
    private String name;
    private Double price;
    private Integer pageCount;
    private String author;
}
