package com.example.myBook.service.impl;

import com.example.myBook.dto.respond.CustomersViewRespondDTO;
import com.example.myBook.entity.CustomersViewEntity;
import com.example.myBook.repostory.CustomersViewRepository;
import com.example.myBook.service.CustomersViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CustomerViewServiceImpl implements CustomersViewService {
    private final CustomersViewRepository customersViewRepository;

    @Override
    public CustomersViewRespondDTO findView(Long id) {
        List<CustomersViewEntity> customersViewEntity=customersViewRepository.findById(id).stream().toList();
        CustomersViewRespondDTO customersViewRespondDTO=new CustomersViewRespondDTO();
        customersViewRespondDTO.setCustomersViewEntityList(customersViewEntity);
        return customersViewRespondDTO;
    }
}
