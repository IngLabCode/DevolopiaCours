package com.example.librarian.dto.respond;

import com.example.librarian.entity.BookEntity;
import lombok.Data;

import java.util.List;

@Data
public class BookFindAllRespondDTO {
  private List<BookEntity> bookEntityList;
}
