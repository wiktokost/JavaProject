package com.example.ipstackwebapi.controller;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.contract.IpGeolocationDto;
import com.example.ipstackwebapi.service.IpGeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class IpGeolocationController {
    private final IpGeolocationService service;

    @Autowired
    public IpGeolocationController(IpGeolocationService service) {
        this.service = service;
    }

    @GetMapping("/id/{id}")
    Optional<IpGeolocation> getIpById(@PathVariable("id") Long id){
        return service.getId(id);
    }

    @GetMapping( "/all")
    public List<IpGeolocationDto> getAllData(){
        return service.getAll();
    }

    @PostMapping("/")
    public long saveIpStack(@RequestBody IpGeolocationDto ipStack){
        return service.addIpStack(ipStack);
    }

}
