package com.example.myBook.dto.respond;

import lombok.Data;

@Data
public class BookFindByIdRespondDTO {
    private Long id;
    private String name;
    private Double price;
    private Integer pageCount;
    private String author;
}
