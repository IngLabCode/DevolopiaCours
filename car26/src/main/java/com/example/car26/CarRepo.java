package com.example.car26;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepo extends JpaRepository<CarEntity,Long> {
    @Query(value = "select * from car26 where brand like %?1%",nativeQuery = true)
    List<CarEntity> findByBrandnative(String name);



    List<CarEntity> findByBrand(String name);
}
