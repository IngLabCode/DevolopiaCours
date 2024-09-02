package com.example.myBook.controller;

import com.example.myBook.dto.respond.CustomersViewRespondDTO;
import com.example.myBook.service.CustomersViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomersController {
    private final CustomersViewService customersViewService;

    @GetMapping("/{id}")
    CustomersViewRespondDTO findView(@PathVariable Long id){
       return customersViewService.findView(id);
    }
}
