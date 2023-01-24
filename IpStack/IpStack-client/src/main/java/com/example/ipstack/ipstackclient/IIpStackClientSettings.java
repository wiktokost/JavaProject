package com.example.ipstack.ipstackclient;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public interface IIpStackClientSettings {
    String getApiKey();

    String getBaseUrl();

    default UriComponentsBuilder getUrlBuilder() {
        return UriComponentsBuilder.newInstance().scheme("http").host(getBaseUrl());
    }
}
