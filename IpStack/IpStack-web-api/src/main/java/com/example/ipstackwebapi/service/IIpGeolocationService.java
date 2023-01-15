package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.contract.IpGeolocationSummaryDto;

import java.util.List;

public interface IIpGeolocationService {
    List<IpGeolocation> getAll();
//    long saveIpStack(IpGeolocationDto dto);
}
