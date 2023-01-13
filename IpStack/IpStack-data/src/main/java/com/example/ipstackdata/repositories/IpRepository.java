package com.example.ipstackdata.repositories;

import com.example.ipstackdata.model.IpGeolocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpRepository extends JpaRepository<IpGeolocation, Long> {
}
