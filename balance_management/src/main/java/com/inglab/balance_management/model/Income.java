package com.inglab.balance_management.model;

import jakarta.persistence.*;
import org.apache.commons.lang3.DoubleRange;

import java.util.Date;

@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String description;
    private Double amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
