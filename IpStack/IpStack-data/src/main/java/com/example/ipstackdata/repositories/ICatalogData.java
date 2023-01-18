package com.example.ipstackdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICatalogData {
    IpRepository getIpGeolocation();
    LocationRepository getLocation();
    LanguageRepository getLanguage();
}
