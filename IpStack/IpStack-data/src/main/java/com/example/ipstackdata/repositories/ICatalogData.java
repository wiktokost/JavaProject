package com.example.ipstackdata.repositories;

public interface ICatalogData {
    IpRepository getIpGeolocation();
    LocationRepository getLocation();
    LanguageRepository getLanguage();
}
