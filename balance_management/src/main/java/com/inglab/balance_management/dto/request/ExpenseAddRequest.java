package com.inglab.balance_management.dto.request;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Data
public class ExpenseAddRequest {
    private String category;
    private String description;
    private Double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
