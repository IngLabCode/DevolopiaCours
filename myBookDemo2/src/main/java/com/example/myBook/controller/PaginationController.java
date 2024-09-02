package com.example.myBook.controller;

import com.example.myBook.dto.respond.PaginationRespondDTO;
import com.example.myBook.service.PaginationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaginationController {
    private final PaginationService paginationService;

    @GetMapping("/begin/{begin}/length/{length}")
    public PaginationRespondDTO findPagination(@PathVariable Integer begin, @PathVariable Integer length) {
        PaginationRespondDTO paginationRespondDTO = new PaginationRespondDTO();
        return paginationService.findPagination(begin, length);
    }
}
