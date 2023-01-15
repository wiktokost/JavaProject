package com.example.ipstackwebapi.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IpGeolocationSummaryDto {
    private String ip;
    private String type;
    private double latitude;
    private double longitude;
}
