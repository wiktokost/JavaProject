package com.example.ipstackwebapi.contract;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackdata.model.Language;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LocationDto {

    private Integer geonameId;
    private String capital;
    private List<LanguageDto> languages;
    private String countryFlag;
    private String countryFlagEmoji;
    private String countryFlagEmojiUnicode;
    private String callingCode;
    private Boolean isEu;
}
