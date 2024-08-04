package com.example.book27.request;

import lombok.Data;

@Data
public class BookAddRequestDTO {
    private String name;
    private Double price;
    private Integer pageCount;
    private String author;
}
