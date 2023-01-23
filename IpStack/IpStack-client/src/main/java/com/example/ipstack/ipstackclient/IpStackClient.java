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
    private final IIpStackClientSettings IpStackSettings;

    public IpStackClient(IIpStackClientSettings settings) {
        restTemplate = new RestTemplate();
        this.baseUrl = settings.getBaseUrl();
        this.apiKey = settings.getApiKey();
        IpStackSettings = settings;
//        this.ip = settings.getIp();
    }

    @Override
    public IpGeolocationDto getGeolocationByIp(String ip) {
        var url = "http://api.ipstack.com/162.253.68.213?access_key=9ce46658fd7d6b0405e91dccffc9bbdd";
//        var url = IpStackSettings.getUrlBuilder().pathSegment(ip).queryParam("apiKey", apiKey).build().toUriString();
        return restTemplate.getForObject(url, IpGeolocationDto.class);
    }
}
