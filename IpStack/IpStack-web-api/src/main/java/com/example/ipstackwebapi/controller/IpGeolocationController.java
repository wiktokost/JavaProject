package com.example.ipstackwebapi.controller;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.service.IpGeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IpGeolocationController {
    private final IpGeolocationService service;

    @Autowired
    public IpGeolocationController(IpGeolocationService service) {
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
