package com.example.sven.carsmicro.controllers;

import com.example.sven.carsmicro.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.sven.carsmicro.repositories.CarRepo;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/cars")
public class CarsResource {
    @Autowired
    private CarRepo carRepo;

    @GetMapping("")
    public List<Car> getAllCars(){
        return (List<Car>) carRepo.findAll();
    }

    @RequestMapping("/{carId}")
    public Optional<Car> getCar(@PathVariable("carId") Long carId) {
        return carRepo.findById(carId);
    }

    @PostMapping("/")
    public Car saveCar(@RequestBody Car car){
        Car toSave = new Car(car.getName(), car.getPrice(), car.getLicensePlate());

        carRepo.save(toSave);

        return toSave;
    }
}
