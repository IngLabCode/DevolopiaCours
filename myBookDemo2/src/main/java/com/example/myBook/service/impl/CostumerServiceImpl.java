package com.example.myBook.service.impl;

import com.example.myBook.dto.respond.CostumerRespondDTO;
import com.example.myBook.entity.CostumerEntity;
import com.example.myBook.repostory.CostumerRepository;
import com.example.myBook.service.CostumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CostumerServiceImpl implements CostumerService {
    private final CostumerRepository costumerRepository;
    @Override
    public CostumerRespondDTO findById(Long id) {
        List<CostumerEntity> costumerEntity= costumerRepository.findById(id).stream().toList();
     CostumerRespondDTO costumerRespondDTO=new CostumerRespondDTO();
     costumerRespondDTO.setCostumerEntity(costumerEntity);
     return costumerRespondDTO;
    }
}
