package com.example.librarian.dto.respond;

import lombok.Data;

import java.util.List;

@Data
public class BookFindAllListRespondDTO {
    private List<BookFindAllRespondDTO> bookFindAllRespondDTOList;
}
