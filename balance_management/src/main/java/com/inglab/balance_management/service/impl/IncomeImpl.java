package com.inglab.balance_management.service.impl;

import com.inglab.balance_management.dto.response.IncomeRespond;
import com.inglab.balance_management.repository.IncomeRepository;
import com.inglab.balance_management.service.inter.IncomeInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class IncomeImpl implements IncomeInter {

    private final IncomeRepository incomeRepository;

    @Override
    public IncomeRespond getIncomeByCategoryAndDate(String category, Date startDate, Date endDate) {
        return incomeRepository.findByCategoryAndDateBetween(category, startDate, endDate);
    }

    @Override
    public IncomeRespond getIncomeByDate(Date startDate, Date endDate) {
        return incomeRepository.findByDateBetween(startDate, endDate);
    }
}
