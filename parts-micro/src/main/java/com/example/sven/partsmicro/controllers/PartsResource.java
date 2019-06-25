package com.example.sven.partsmicro.controllers;

import com.example.sven.partsmicro.Repositories.PartRepo;
import com.example.sven.partsmicro.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/parts")
public class PartsResource {
    @Autowired
    PartRepo partRepo;

    @GetMapping("/{partId}")
    public Optional<Part> getPart(@PathVariable("partId")Long partId){
        return partRepo.findById(partId);
    }

    @GetMapping("/byName/{name}/{amount}")
    public Part getByNamePart(@PathVariable("name") String name, @PathVariable("amount") int amount){
        Part foundPart = partRepo.findPartByNameEquals(name);

        if(foundPart.getAmount() != 0){
            foundPart.setAmount(foundPart.getAmount() - amount);
            partRepo.save(foundPart);
            return foundPart;
        } else {
            return null;
        }
    }

    @PostMapping("/")
    public Part savePart(@RequestBody Part part){
        Part toSave = new Part(part.getName(), part.getAmount(), part.getPrice());

        partRepo.save(toSave);

        return toSave;
    }
}
