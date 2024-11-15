package com.inglab.balance_management.controller;

import com.inglab.balance_management.dto.request.ExpenseAddRequest;
import com.inglab.balance_management.dto.request.ExpensesAddRequest;
import com.inglab.balance_management.dto.response.ExpensesRespond;
import com.inglab.balance_management.service.impl.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private ExpenseService expenseService;


    @PutMapping("/add")
    public ResponseEntity<String> addExpenses(@RequestBody ExpensesAddRequest expensesAddRequest) {
        try {
            expenseService.addExpenses(expensesAddRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body("Expenses added successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
        }
    }


    //  Xərc kateqoriyasına və tarix aralığına görə
    @GetMapping("/category")
    public ResponseEntity<ExpensesRespond> getExpensesByCategoryAndDate(
            @RequestParam String category,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return ResponseEntity.ok(expenseService.getExpensesByCategoryAndDate(category, startDate, endDate));
    }

    //  Təkcə tarix aralığına görə
    @GetMapping("/date")
    public ResponseEntity<ExpensesRespond> getExpensesByDate(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return ResponseEntity.ok(expenseService.getExpensesByDate(startDate, endDate));
    }
}



