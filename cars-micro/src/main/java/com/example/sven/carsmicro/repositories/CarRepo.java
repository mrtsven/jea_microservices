package com.example.sven.carsmicro.repositories;

import com.example.sven.carsmicro.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car, Long> {
}
