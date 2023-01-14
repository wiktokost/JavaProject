package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;

import java.util.List;

public interface IIpGeolocationService {
    List<IpGeolocation> getAll();
//    long saveIpStack(IpGeolocationDto dto);
}
