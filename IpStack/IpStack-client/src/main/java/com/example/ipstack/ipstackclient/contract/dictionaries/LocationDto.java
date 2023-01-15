package com.example.ipstack.ipstackclient.contract.dictionaries;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class LocationDto {
    @JsonProperty("geoname_id")
    private Integer geonameId;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("languages")
    private List<LanguageDto> languages = new ArrayList<>();
    @JsonProperty("country_flag")
    private String countryFlag;
    @JsonProperty("country_flag_emoji")
    private String countryFlagEmoji;
    @JsonProperty("country_flag_emoji_unicode")
    private String countryFlagEmojiUnicode;
    @JsonProperty("calling_code")
    private String callingCode;
    @JsonProperty("is_eu")
    private Boolean isEu;
}
