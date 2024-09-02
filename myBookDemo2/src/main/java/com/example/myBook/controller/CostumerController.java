package com.example.myBook.controller;

import com.example.myBook.dto.respond.CostumerRespondDTO;
import com.example.myBook.service.CostumerService;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class CostumerController {
    private final CostumerService costumerService;

    @GetMapping("/findbyid/{id}")
    public CostumerRespondDTO findById(@PathVariable Long id){
        return costumerService.findById(id);
    }
}
