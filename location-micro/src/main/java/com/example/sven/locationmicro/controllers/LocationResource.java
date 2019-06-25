package com.example.sven.locationmicro.controllers;

import com.example.sven.locationmicro.domain.Car;
import com.example.sven.locationmicro.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("")
    public List<Car> availableCars(){
        Car[] response = restTemplate.getForObject("http://localhost:8000/cars", Car[].class);

        return Arrays.asList(response);
    }

    @GetMapping("/order/{name}/{amount}")
    public String availableCars(@PathVariable("name") String name, @PathVariable("amount") int amount){
        Part response = restTemplate.getForObject("http://localhost:8002/parts/byName/" + name + "/" + amount, Part.class);

        if(response != null){
            return response.toString();
        } else {
            return "This product is not available";
        }

    }
}
