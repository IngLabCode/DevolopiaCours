package com.inglab.balance_management.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String description;
    private Double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
}
