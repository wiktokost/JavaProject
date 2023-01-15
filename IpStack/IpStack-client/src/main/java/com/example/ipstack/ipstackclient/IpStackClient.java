package com.example.ipstack.ipstackclient;


import com.example.ipstack.ipstackclient.contract.IpGeolocationDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IpStackClient implements IIpStackClient{
    RestTemplate restTemplate;
    String baseUrl;
    String apiKey;
    String ip;
    private IIpStackClientSettings IpStackSettings;

    public IpStackClient(IIpStackClientSettings settings) {
        restTemplate = new RestTemplate();
        this.baseUrl = settings.getBaseUrl();
        this.apiKey = settings.getApiKey();
        this.ip = settings.getIp();
    }

    @Override
    public IpGeolocationDto getGeolocationDescription() {
//        var url = IpStackSettings.getUrlBuilder().queryParam("apiKey", apiKey).build().toUriString();
//        return restTemplate.getForObject(url, IpGeolocationDto.class);
    return null;
    }
}
