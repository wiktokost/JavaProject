package com.example.ipstackdata.repositories;

import com.example.ipstackdata.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
