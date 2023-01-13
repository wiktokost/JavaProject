package com.example.ipstackwebapi.controller;


import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.contract.IpGeolocationDto;
import com.example.ipstackwebapi.service.IpStackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IpStackController {
    private final IpStackService service;

    @Autowired
    public IpStackController(IpStackService service) {
        this.service = service;
    }

//    @PostMapping()
//    public long saveIpStack(@Validated @RequestBody IpGeolocationDto ipStack){
//        return service.saveIpStack(ipStack);
//    }

    @GetMapping( "/all")
    public List<IpGeolocation> getAllData(){
        return service.getAll();
    }

}
