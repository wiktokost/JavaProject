package com.example.ipstackupdater.mappers;

import com.example.ipstackdata.model.IpGeolocation;

public interface IMapEntities <TDto, TEntity>{
    TEntity map(TDto dto);
    TEntity map(TDto dto, TEntity entity);
}
