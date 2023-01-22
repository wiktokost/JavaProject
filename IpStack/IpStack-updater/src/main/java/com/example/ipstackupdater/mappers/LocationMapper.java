package com.example.ipstackupdater.mappers;

import com.example.ipstack.ipstackclient.contract.dictionaries.LocationDto;
import com.example.ipstackdata.model.Location;

public class LocationMapper implements IMapEntities<LocationDto, Location>{

    @Override
    public Location map(LocationDto locationDto) {
        return map(locationDto, new Location());
    }

    @Override
    public Location map(LocationDto locationDto, Location location) {
        location.setGeonameId(locationDto.getGeonameId());
        location.setCapital(locationDto.getCapital());
        location.setCountryFlag(locationDto.getCountryFlag());
        location.setCountryFlagEmoji(locationDto.getCountryFlagEmoji());
        location.setCountryFlagEmojiUnicode(locationDto.getCountryFlagEmojiUnicode());
        location.setCallingCode(locationDto.getCallingCode());
        location.setIsEu(locationDto.getIsEu());
        return location;
    }
}
