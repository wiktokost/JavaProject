package com.example.ipstack.ipstackclient;

import org.springframework.web.util.UriComponentsBuilder;

public interface IIpStackClientSettings {
    String getApiKey();

    String getBaseUrl();

//    String getIp();

    default UriComponentsBuilder getUrlBuilder() {
        return UriComponentsBuilder.newInstance().scheme("http").host(getBaseUrl());//.pathSegment(getIp()).queryParam("api_key", getApiKey())
    }
}

//    http://api.ipstack.com/134.201.250.155?access_key = YOUR_ACCESS_KEY
