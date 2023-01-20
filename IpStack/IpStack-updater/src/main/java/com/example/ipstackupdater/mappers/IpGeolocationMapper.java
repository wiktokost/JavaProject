package com.example.ipstackupdater.mappers;

import com.example.ipstack.ipstackclient.contract.IpGeolocationDto;
import com.example.ipstackdata.model.IpGeolocation;

public class IpGeolocationMapper implements IMapEntities<IpGeolocationDto, IpGeolocation> {
    @Override
    public IpGeolocation map(IpGeolocationDto ipGeolocationDto) {
        return map(ipGeolocationDto, new IpGeolocation());
    }

    @Override
    public IpGeolocation map(IpGeolocationDto ipGeolocationDto, IpGeolocation ipGeolocation) {
        ipGeolocation.setIp(ipGeolocationDto.getIp());
        ipGeolocation.setType(ipGeolocationDto.getType());
        ipGeolocation.setContinentCode(ipGeolocationDto.getContinentCode());
        ipGeolocation.setContinentName(ipGeolocationDto.getContinentName());
        ipGeolocation.setCountryCode(ipGeolocationDto.getCountryCode());
        ipGeolocation.setCountryName(ipGeolocationDto.getCountryName());
        ipGeolocation.setRegionCode(ipGeolocation.getRegionCode());
        ipGeolocation.setRegionName(ipGeolocationDto.getRegionName());
        ipGeolocation.setCity(ipGeolocationDto.getCity());
        ipGeolocation.setZip(ipGeolocationDto.getZip());
        ipGeolocation.setLatitude(ipGeolocationDto.getLatitude());
        ipGeolocation.setLongitude(ipGeolocationDto.getLongitude());
        return ipGeolocation;
    }
}
