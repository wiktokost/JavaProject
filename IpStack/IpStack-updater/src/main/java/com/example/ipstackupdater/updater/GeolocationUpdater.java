package com.example.ipstackupdater.updater;

import com.example.ipstack.ipstackclient.IIpStackClient;
import com.example.ipstackdata.repositories.ICatalogData;
import com.example.ipstackupdater.mappers.ICatalogMappers;
import org.springframework.stereotype.Component;

@Component
public class GeolocationUpdater implements IUpdateGeolocation{
    private final ICatalogData catalogData;
    private final IIpStackClient ipStackClient;
    private final ICatalogMappers catalogMappers;

    public GeolocationUpdater(ICatalogData catalogData, IIpStackClient ipStackClient, ICatalogMappers catalogMappers) {
        this.catalogData = catalogData;
        this.ipStackClient = ipStackClient;
        this.catalogMappers = catalogMappers;
    }

    @Override
    public void updateByIp(String ip) {
        var result = ipStackClient.getGeolocationByIp(ip);
        var entity = catalogMappers.forIpGeolocation().map(result);

        catalogData.getIpGeolocation().save(entity);

    }
}
