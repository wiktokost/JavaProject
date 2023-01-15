package com.example.ipstackupdater.mappers;

import com.example.ipstack.ipstackclient.contract.dictionaries.LanguageDto;
import com.example.ipstackdata.model.Language;

public class LanguageMapper implements IMapEntities<LanguageDto, Language> {
    @Override
    public Language map(LanguageDto languageDto) {
        return map(languageDto, new Language());
    }

    @Override
    public Language map(LanguageDto languageDto, Language language) {
        language.setCode(languageDto.getCode());
        language.setName(languageDto.getName());
        language.setNativeName(languageDto.getNativeName());
        return language;
    }
}
