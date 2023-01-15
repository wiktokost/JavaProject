package com.example.ipstackwebapi.service;

import com.example.ipstackwebapi.IpGeolocationSummaryDto;

import java.util.List;

public interface IIpGeolocationService {
    List<IpGeolocationSummaryDto> getAll();
//    long saveIpStack(IpGeolocationDto dto);
}
