package com.inglab.balance_management.repository;

import com.inglab.balance_management.dto.response.IncomeRespond;
import com.inglab.balance_management.model.Income;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    @Query("SELECT I FROM Income  I WHERE I.category =:category AND I.date BETWEEN :startDate and :endDate ")
    IncomeRespond findByCategoryAndDateBetween(@Param("category") String category,
                                               @Param("startDate") Date startDate,
                                               @Param("endDate") Date endDate);

    @Query("SELECT I FROM Income I WHERE I.date between :starDate AND :endDate")
    IncomeRespond findByDateBetween(@Param("starDate")Date startDate,
                                    @Param("endDate")Date endDate);
}
