package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.contract.IpGeolocationDto;

import java.util.List;

public interface IIpStackService {
    List<IpGeolocation> getAll();
//    long saveIpStack(IpGeolocationDto dto);
}
