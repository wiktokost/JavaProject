package com.example.ipstackupdater.mappers;

import com.example.ipstack.ipstackclient.contract.IpGeolocationDto;
import com.example.ipstack.ipstackclient.contract.dictionaries.LanguageDto;
import com.example.ipstack.ipstackclient.contract.dictionaries.LocationDto;
import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackdata.model.Language;
import com.example.ipstackdata.model.Location;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper implements ICatalogMappers {
    private final IMapEntities<IpGeolocationDto, IpGeolocation> forIpGeolocation;
    private final IMapEntities<LocationDto, Location> forLocation;
    private final IMapEntities<LanguageDto, Language> forLanguage;

    public EntityMapper(IMapEntities<IpGeolocationDto, IpGeolocation> forIpGeolocation, IMapEntities<LocationDto, Location> forLocation, IMapEntities<LanguageDto, Language> forLanguage) {
        this.forIpGeolocation = forIpGeolocation;
        this.forLocation = forLocation;
        this.forLanguage = forLanguage;
    }

    @Override
    public IMapEntities<IpGeolocationDto, IpGeolocation> forIpGeolocation() {
        return forIpGeolocation;
    }

    @Override
    public IMapEntities<LocationDto, Location> forLocation() {
        return forLocation;
    }

    @Override
    public IMapEntities<LanguageDto, Language> forLanguage() {
        return forLanguage;
    }
}
