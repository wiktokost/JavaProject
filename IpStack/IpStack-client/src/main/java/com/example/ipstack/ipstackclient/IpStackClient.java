package com.example.ipstack.ipstackclient;


import com.example.ipstack.ipstackclient.contract.IpGeolocationDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IpStackClient implements IIpStackClient{
    RestTemplate restTemplate;
    String baseUrl;
    String apiKey;
    private final IIpStackClientSettings IpStackSettings;

    public IpStackClient(IIpStackClientSettings settings) {
        restTemplate = new RestTemplate();
        this.baseUrl = settings.getBaseUrl();
        this.apiKey = settings.getApiKey();
        IpStackSettings = settings;
    }

    @Override
    public IpGeolocationDto getGeolocationByIp(String ip) {
        var url = IpStackSettings.getUrlBuilder().path("/"+ip).queryParam("access_key={api}").buildAndExpand(apiKey).toUriString();
        return restTemplate.getForObject(url, IpGeolocationDto.class);
    }
}
