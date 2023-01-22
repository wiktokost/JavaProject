package com.example.ipstackwebapi.controller;

import com.example.ipstackwebapi.contract.IpGeolocationDto;
import com.example.ipstackwebapi.service.IpGeolocationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Log4j2
public class IpGeolocationController {
    private final IpGeolocationService service;

    @Autowired
    public IpGeolocationController(IpGeolocationService service) {
        this.service = service;
    }

    @GetMapping( "/all/Geolocation")
    public ResponseEntity<List<IpGeolocationDto>> getAllDataForGeolocation(){
        log.warn("Exposing all data");
        return ResponseEntity.ok(service.getAllGeolocation());
    }

    @PostMapping("/add")
    public ResponseEntity<Object> saveIpStack(@RequestBody IpGeolocationDto ipStack){
        var id =service.addIpStack(ipStack);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
