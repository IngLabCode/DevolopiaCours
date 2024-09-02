package com.example.myBook.dto.respond;

import com.example.myBook.entity.BookEntity;
import lombok.Data;

import java.util.List;
@Data
public class PaginationRespondDTO {
    private List<BookEntity> bookEntityList;
}
