package com.example.ipstack.ipstackclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class IpStackClientSettings implements IIpStackClientSettings {
    private String apiKey = System.getenv("API_KEY");
    private String baseUrl = "api.ipstack.com";

    @Override
    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }
}
