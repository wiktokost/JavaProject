package com.example.ipstack.ipstackclient;

import com.example.ipstack.ipstackclient.contract.IpGeolocationDto;

public interface IIpStackClient {
//        IpGeolocationDto getGeolocationDescription();
        IpGeolocationDto getGeolocationByIp(String ip);
}
