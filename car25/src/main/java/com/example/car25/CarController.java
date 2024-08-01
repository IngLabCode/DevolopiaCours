package com.example.car25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarRepo carRepo;

    @GetMapping("/save")
    public List<CarEntity> list() {
        CarEntity carEntity = new CarEntity("audi", 20000, LocalDate.now());
        carRepo.save(carEntity);
       return  carRepo.findAll();
    }
}
