package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackdata.model.Language;
import com.example.ipstackdata.model.Location;
import com.example.ipstackdata.repositories.CatalogData;
import com.example.ipstackwebapi.contract.IpGeolocationDto;
import com.example.ipstackwebapi.contract.LanguageDto;
import com.example.ipstackwebapi.contract.LocationDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IpGeolocationService implements IIpGeolocationService {

    private final CatalogData db;

    public IpGeolocationService(CatalogData db) {
        this.db = db;
    }

    public Optional<IpGeolocation> getGeolocationById(Long id){
        return db.getIpGeolocation().findById(id);
    }

    @Override
    public List<IpGeolocationDto> getGeolocations() {
        return db.getIpGeolocation()
                .findAll()
                .stream()
                .map(entity->new IpGeolocationDto(entity.getIp(),
                        entity.getType(),
                        entity.getLatitude(),
                        entity.getLongitude(),
                        entity.getContinentCode(),
                        entity.getContinentName(),
                        entity.getCountryCode(),
                        entity.getCountryName(),
                        entity.getRegionCode(),
                        entity.getRegionName(),
                        mapLocationDto(entity.getLocation())))
                .toList();
    }

    public LocationDto mapLocationDto(Location location){
        LocationDto locationDto = new LocationDto();
        locationDto.setCapital(location.getCapital());
        locationDto.setIsEu(location.getIsEu());
        locationDto.setCountryFlagEmoji(location.getCountryFlagEmoji());
        locationDto.setCountryFlag(location.getCountryFlag());
        locationDto.setCallingCode(location.getCallingCode());
        locationDto.setGeonameId(location.getGeonameId());
        locationDto.setCountryFlagEmojiUnicode(location.getCountryFlagEmojiUnicode());
        locationDto.setLanguages(mapLanguagesDto(location.getLanguages()));

        return locationDto;
    }

    public List<LanguageDto> mapLanguagesDto(List<Language> languages){
        List<LanguageDto> languagesDto = new ArrayList<>();
        for (Language language : languages){
            LanguageDto languageDto = new LanguageDto();
            languageDto.setName(language.getName());
            languageDto.setCode(language.getCode());
            languageDto.setNativeName(language.getNativeName());
            languagesDto.add(languageDto);
        }
        return languagesDto;
    }

    public long addIpStack(IpGeolocationDto dto){
        var ipStackEntity = new IpGeolocation();
        ipStackEntity.setIp(dto.getIp());
        ipStackEntity.setType(dto.getType());
        ipStackEntity.setLatitude(dto.getLatitude());
        ipStackEntity.setLongitude(dto.getLongitude());
        ipStackEntity.setContinentCode(dto.getContinentCode());
        ipStackEntity.setContinentName(dto.getContinentName());
        ipStackEntity.setCountryCode(dto.getCountryCode());
        ipStackEntity.setCountryName(dto.getCountryName());
        ipStackEntity.setRegionCode(dto.getRegionCode());
        ipStackEntity.setRegionName(dto.getRegionName());
        db.getIpGeolocation().save(ipStackEntity);
        return ipStackEntity.getId();
    }

    public void deleteById(Long id){
       db.getIpGeolocation().deleteById(id);
    }

}
