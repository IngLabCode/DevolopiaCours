package com.example.myBook.dto.respond;

import lombok.Data;

@Data
public class BookFindByNameRespondDTO {
    private Long id;
    private String name;
    private Double price;
    private Integer pageCount;
    private String author;
}
