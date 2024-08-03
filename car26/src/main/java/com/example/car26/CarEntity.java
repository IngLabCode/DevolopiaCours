package com.example.car26;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car26")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private Integer price;
    private LocalDate date;

    public CarEntity(String brand, Integer price, LocalDate date) {
        this.brand = brand;
        this.price = price;
        this.date = date;
    }
}
