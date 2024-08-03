package com.example.car26;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class CarController {
    @Autowired
    private CarRepo carRepo;

    @GetMapping("/save/{id}")
    public Optional<CarEntity> list(@PathVariable Long id) {
        CarEntity carEntity = new CarEntity("audi", 20000, LocalDate.now());
        carRepo.save(carEntity);
        Optional<CarEntity> carEntityOptional = carRepo.findById(id);
        if (carEntityOptional.isPresent()) {
            return Optional.of(carEntityOptional.get());
        } else {
            throw new CarException("tapilmadi: " + id,"not found");
        }

    }
    @ExceptionHandler
    public ErrorRespons handleCarException(CarException ex){
        ErrorRespons errorRespons=new ErrorRespons();
        errorRespons.setMessage(ex.getMessage());
        errorRespons.setInternalMesagge(ex.getInternalMessage());
return  errorRespons;
    }
    @GetMapping("/search")
     public List<CarEntity> carEntityList1(@RequestParam(name = "",required = false,defaultValue = "search")String name){
       List<CarEntity> carEntityList1= carRepo.findByBrandnative(name);
       return carEntityList1;
    }
}
