package com.inglab.balance_management.service.inter;

import com.inglab.balance_management.dto.response.IncomeRespond;

import java.util.Date;


public interface IncomeInter {
    IncomeRespond getIncomeByCategoryAndDate(String category, Date startDate, Date endDate);

    IncomeRespond getIncomeByDate(Date startDate, Date endDate);
}
