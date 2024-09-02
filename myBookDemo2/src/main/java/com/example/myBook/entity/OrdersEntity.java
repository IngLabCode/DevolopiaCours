package com.example.myBook.entity;

import com.example.myBook.repostory.OrderDetailRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    @OneToMany
    @JoinColumn(name = "order_id")
    private List<OrderDetailsEntity> orderDetailsEntityList;
}
