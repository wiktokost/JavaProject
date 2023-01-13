package com.example.ipstackdata.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer geonameId;

    private String capital;
    @OneToMany
    private List<Language> languages = new ArrayList<>();

    private String countryFlag;

    private String countryFlagEmoji;

    private String countryFlagEmojiUnicode;

    private String callingCode;

    private Boolean isEu;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public String getCountryFlagEmoji() {
        return countryFlagEmoji;
    }

    public void setCountryFlagEmoji(String countryFlagEmoji) {
        this.countryFlagEmoji = countryFlagEmoji;
    }

    public String getCountryFlagEmojiUnicode() {
        return countryFlagEmojiUnicode;
    }

    public void setCountryFlagEmojiUnicode(String countryFlagEmojiUnicode) {
        this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public Boolean getEu() {
        return isEu;
    }

    public void setEu(Boolean eu) {
        isEu = eu;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
}
