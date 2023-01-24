package com.example.ipstackupdater.updater;

import com.example.ipstack.ipstackclient.IIpStackClient;
import com.example.ipstackdata.repositories.ICatalogData;
import com.example.ipstackdata.repositories.LanguageRepository;
import com.example.ipstackupdater.mappers.ICatalogMappers;
import org.springframework.stereotype.Component;

@Component
public class GeolocationUpdater implements IUpdateGeolocation{
    private final ICatalogData catalogData;
    private final IIpStackClient ipStackClient;
    private final ICatalogMappers catalogMappers;
    private final LanguageRepository languageRepository;

    public GeolocationUpdater(ICatalogData catalogData, IIpStackClient ipStackClient, ICatalogMappers catalogMappers,
                              LanguageRepository languageRepository) {
        this.catalogData = catalogData;
        this.ipStackClient = ipStackClient;
        this.catalogMappers = catalogMappers;
        this.languageRepository = languageRepository;
    }

    @Override
    public void updateByIp(String ip) {
        var geolocationDto = ipStackClient.getGeolocationByIp(ip);
        var geolocation = catalogMappers.forIpGeolocation().map(geolocationDto);
        var locationDto = geolocationDto.getLocation();
        var location = catalogMappers.forLocation().map(locationDto);

        location.setIpGeolocation(geolocation);
        catalogData.getIpGeolocation().save(geolocation);
        catalogData.getLocation().save(location);

        var languagesDto = locationDto.getLanguages();
        languagesDto.forEach((languageDto)->{
            var language = catalogMappers.forLanguage().map(languageDto);
            language.setLocation(location);
            catalogData.getLanguage().save(language);
        });
    }
}
