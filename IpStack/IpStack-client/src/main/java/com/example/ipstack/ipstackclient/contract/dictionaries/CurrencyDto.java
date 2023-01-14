package com.example.ipstack.ipstackclient.contract.dictionaries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyDto {
    @JsonProperty("currency.code")
     private String code;
    @JsonProperty("currency.name")
     private String name;
    @JsonProperty("currency.symbol")
     private String symbol;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
