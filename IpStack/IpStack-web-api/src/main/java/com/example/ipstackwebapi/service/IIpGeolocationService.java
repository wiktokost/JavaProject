package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.contract.IpGeolocationDto;

import java.util.List;
import java.util.Optional;

public interface IIpGeolocationService {
    Optional<IpGeolocation> getId(Long id);
    List<IpGeolocationDto> getAllGeolocation();
    long addIpStack(IpGeolocationDto dto);
}
