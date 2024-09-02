package com.example.myBook.dto.respond;

import com.example.myBook.entity.CostumerEntity;
import lombok.Data;

import java.util.List;

@Data
public class CostumerRespondDTO {
    private List<CostumerEntity> costumerEntity;
}
