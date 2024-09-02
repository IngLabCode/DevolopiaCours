package com.example.myBook.dto.respond;

import com.example.myBook.entity.CustomersViewEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomersViewRespondDTO {
    private List<CustomersViewEntity> customersViewEntityList;
}
