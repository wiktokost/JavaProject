package com.example.ipstackupdater.mappers;

import com.example.ipstack.ipstackclient.contract.IpGeolocationDto;
import com.example.ipstack.ipstackclient.contract.dictionaries.LanguageDto;
import com.example.ipstack.ipstackclient.contract.dictionaries.LocationDto;
import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackdata.model.Language;
import com.example.ipstackdata.model.Location;

public interface ICatalogMappers {
    IMapEntities <IpGeolocationDto, IpGeolocation> forIpGeolocation();
    IMapEntities <LocationDto, Location> forLocation();
    IMapEntities <LanguageDto, Language> forLanguage();
}
