package com.example.ipstackdata.repositories;

import com.example.ipstackdata.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long>{
}