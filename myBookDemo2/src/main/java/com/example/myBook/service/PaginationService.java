package com.example.myBook.service;

import com.example.myBook.dto.respond.PaginationRespondDTO;

public interface PaginationService {
    PaginationRespondDTO findPagination(Integer begin,Integer length);
}
