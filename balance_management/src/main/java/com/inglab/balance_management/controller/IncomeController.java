package com.inglab.balance_management.controller;

import com.inglab.balance_management.dto.response.IncomeRespond;
import com.inglab.balance_management.service.inter.IncomeInter;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/income")
public class IncomeController {
    private final IncomeInter incomeInter;

    @GetMapping("/category")
    public IncomeRespond etIncomesByCategoryAndDate(@RequestParam String category,
                                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
                                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return incomeInter.getIncomeByCategoryAndDate(category, startDate, endDate);
    }

    @GetMapping("/date")
    public IncomeRespond findByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
                                    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return incomeInter.getIncomeByDate(startDate, endDate);

    }
}
