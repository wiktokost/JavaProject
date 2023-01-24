package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.contract.IpGeolocationDto;

import java.util.List;
import java.util.Optional;

public interface IIpGeolocationService {
    Optional<IpGeolocation> getGeolocationById(Long id);
    List<IpGeolocationDto> getGeolocations();
    long addIpStack(IpGeolocationDto dto);
}
