package com.example.ipstack.ipstackclient;

import com.example.ipstack.ipstackclient.contract.LeadIpToGeolocationDto;

public interface IIpStackClient {
        LeadIpToGeolocationDto getGeolocationDescription();
}
