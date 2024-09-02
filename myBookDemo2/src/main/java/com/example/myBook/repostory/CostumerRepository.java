package com.example.myBook.repostory;

import com.example.myBook.entity.CostumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CostumerRepository extends JpaRepository<CostumerEntity,Long> {
}
