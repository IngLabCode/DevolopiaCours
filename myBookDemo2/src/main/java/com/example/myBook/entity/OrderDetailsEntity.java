package com.example.myBook.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_detail")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double quantity;
    @OneToOne
    @JoinColumn(name = "product_id")
private ProductsEntity productsEntity;
}
