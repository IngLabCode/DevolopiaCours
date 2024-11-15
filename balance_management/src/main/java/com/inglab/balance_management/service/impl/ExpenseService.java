package com.inglab.balance_management.service.impl;

import com.inglab.balance_management.dto.request.ExpensesAddRequest;
import com.inglab.balance_management.dto.response.ExpensesRespond;
import com.inglab.balance_management.model.Expenses;
import com.inglab.balance_management.repository.ExpensesRepository;
import com.inglab.balance_management.service.inter.ExpensesInter;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ExpenseService implements ExpensesInter {
    private final ExpensesRepository expenseRepository;
    private final ModelMapper modelMapper;


    @Override
    public ExpensesRespond getExpensesByCategoryAndDate(String category, Date startDate, Date endDate) {
        return expenseRepository.findByCategoryAndDateBetween(category, startDate, endDate);
    }

    @Override
    public ExpensesRespond getExpensesByDate(Date startDate, Date endDate) {
        return expenseRepository.findByDateBetween(startDate, endDate);
    }

    @Override
    public void addExpenses(ExpensesAddRequest expensesAddRequest) {
        Expenses expenses = new Expenses();
        modelMapper.map(expensesAddRequest, expenses);
        expenseRepository.save(expenses);
    }
}

