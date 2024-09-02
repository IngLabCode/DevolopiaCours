package com.example.myBook.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Entity
@Data
@Table(name = "costumer")
@AllArgsConstructor
@NoArgsConstructor
public class CostumerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double phone;
    @OneToMany
    @JoinColumn(name = "customers_id")
  private List<OrdersEntity> ordersEntityList;
}
