package com.example.ipstack.ipstackclient.contract;

import com.example.ipstack.ipstackclient.contract.dictionaries.CurrencyDto;
import com.example.ipstack.ipstackclient.contract.dictionaries.LocationDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LeadIpToGeolocationDto extends LeadIpToGeolocationSummaryDto {
    @JsonProperty("continent_code")
    private String continentCode;
    @JsonProperty("continent_name")
    private String continentName;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("region_code")
    private String regionCode;
    @JsonProperty("region_name")
    private String regionName;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty("currency")
    private CurrencyDto currency;
}
