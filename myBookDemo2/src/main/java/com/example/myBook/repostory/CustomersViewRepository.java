package com.example.myBook.repostory;

import com.example.myBook.entity.CustomersViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersViewRepository extends JpaRepository<CustomersViewEntity,Long> {
}
