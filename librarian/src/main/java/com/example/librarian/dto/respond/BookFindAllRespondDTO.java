package com.example.librarian.dto.respond;

import lombok.Data;

@Data
public class BookFindAllRespondDTO {
    private Long id;
    private String name;
    private Integer pageCount;
    private String author;
    private String genre;
}
