package com.example.sven.partsmicro.Repositories;

import com.example.sven.partsmicro.domain.Part;
import org.springframework.data.repository.CrudRepository;

public interface PartRepo extends CrudRepository<Part, Long> {
    Part findPartByNameEquals(String name);
}
