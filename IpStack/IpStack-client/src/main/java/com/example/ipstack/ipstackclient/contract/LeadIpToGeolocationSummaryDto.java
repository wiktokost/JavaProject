package com.example.ipstack.ipstackclient.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeadIpToGeolocationSummaryDto {
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("type")
    private String type;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
