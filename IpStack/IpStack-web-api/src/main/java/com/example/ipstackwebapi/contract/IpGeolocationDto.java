package com.example.ipstackwebapi.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IpGeolocationDto extends IpGeolocationSummaryDto {
    private String continentCode;
    private String continentName;
    private String countryCode;
    private String countryName;
    private String regionCode;
    private String regionName;
}
