package com.inglab.balance_management.dto.response;


import com.inglab.balance_management.model.Expenses;

import java.time.LocalDateTime;
import java.util.List;

public record ExpensesRespond(List<Expenses> expensesList
                              ) {




}

