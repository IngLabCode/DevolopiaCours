package com.inglab.balance_management.dto.request;

import java.time.LocalDateTime;

public record ExpensesAddRequest(Integer amount,
                                 LocalDateTime date,
                                 String description,
                                 String paymentMethod) {

    public static ExpensesAddRequest of(Integer amount, String description, String paymentMethod) {
        return new ExpensesAddRequest(amount, LocalDateTime.now(), description, paymentMethod);
    }

    public ExpensesAddRequest {
        if (amount != null && amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
    }
}
