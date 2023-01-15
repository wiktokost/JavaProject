package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackdata.repositories.CatalogData;
import com.example.ipstackwebapi.contract.IpGeolocationSummaryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IpGeolocationService implements IIpGeolocationService {

    private final CatalogData db;

    public IpGeolocationService(CatalogData db) {
        this.db = db;
    }

    @Override
    public List<IpGeolocation> getAll() {
        return db.getIpGeolocation().findAll();
    }

//    public Optional<IpGeolocation> getId(Long id){
//        return db.getIpGeolocation().findById(id);
//    }

//    public long saveIpStack(IpGeolocationDto dto){
//        var ipStackEntity = new IpGeolocation();
//        ipStackEntity.setIp(dto.getIp());
//        ipStackEntity.setType(dto.getType());
//        ipStackEntity.setLatitude(dto.getLatitude());
//        ipStackEntity.setLongitude(dto.getLongitude());
//        ipStackEntity.setContinentCode(dto.getContinentCode());
//        ipStackEntity.setContinentName(dto.getContinentName());
//        ipStackEntity.setCountryCode(dto.getCountryCode());
//        ipStackEntity.setCountryName(dto.getCountryName());
//        ipStackEntity.setRegionCode(dto.getRegionCode());
//        ipStackEntity.setRegionName(dto.getRegionName());
//        db.getIpGeolocation().save(ipStackEntity);
//        return ipStackEntity.getId();
//    }

}
