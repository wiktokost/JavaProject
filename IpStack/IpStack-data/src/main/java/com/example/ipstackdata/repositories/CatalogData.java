package com.example.ipstackdata.repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@RequiredArgsConstructor
public class CatalogData implements ICatalogData{
    private final IpRepository ipGeolocation;
    private final LanguageRepository language;
    private final LocationRepository location;
    private final CurrencyRepository currency;

}
