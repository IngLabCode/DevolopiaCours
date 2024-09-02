package com.example.myBook.service;

import com.example.myBook.dto.respond.CostumerRespondDTO;

public interface CostumerService {
    CostumerRespondDTO findById(Long id);
}
