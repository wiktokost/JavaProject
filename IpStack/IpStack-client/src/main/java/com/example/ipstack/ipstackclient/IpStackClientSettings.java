package com.example.ipstack.ipstackclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IpStackClientSettings implements IIpStackClientSettings {
    @Value("${API_KEY}")
    private String apiKey;
    @Value("api.ipstack.com")
    private String baseUrl;

    @Override
    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

}
