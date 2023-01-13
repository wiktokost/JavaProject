package com.example.ipstackwebapi.service;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackdata.repositories.CatalogData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IpStackService implements IIpStackService{

    private final CatalogData db;

    public IpStackService(CatalogData db) {
        this.db = db;
    }

    @Override
    public List<IpGeolocation> getAll() {
        return db.getIpGeolocation().findAll();
    }

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
