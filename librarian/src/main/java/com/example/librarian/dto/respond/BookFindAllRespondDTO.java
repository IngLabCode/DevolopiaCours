package com.example.librarian.dto.respond;

import com.example.librarian.entity.BookEntity;
import lombok.Data;

import java.util.List;

@Data
public class BookFindAllRespondDTO {
  private Long id;
  private String name;
  private Integer pageCount;
  private String author;
  private String genre;
}
