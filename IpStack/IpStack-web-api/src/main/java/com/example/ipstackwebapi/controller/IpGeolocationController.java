package com.example.ipstackwebapi.controller;

import com.example.ipstackwebapi.contract.IpGeolocationDto;
import com.example.ipstackwebapi.service.IpGeolocationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Log4j2
@RequestMapping("/ipStack")
public class IpGeolocationController {
    private final IpGeolocationService service;

    @Autowired
    public IpGeolocationController(IpGeolocationService service) {
        this.service = service;
    }

    @GetMapping("/Geolocation/{id}")
    public ResponseEntity<?> getIdGeolocation(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.getGeolocationById(id));
    }

    @GetMapping("/Geolocation/all")
    public ResponseEntity<List<IpGeolocationDto>> getAllDataForGeolocation(){
        log.warn("Exposing all data");
        return ResponseEntity.ok(service.getGeolocations());
    }

    @PostMapping
    public ResponseEntity<?> saveIpStack(@RequestBody IpGeolocationDto ipStack){
        log.info("Creating geolocation");
        var id =service.addIpStack(ipStack);
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/Geolocation/delete/{id}")
    public void deleteGeolocationById(@PathVariable("id") Long id){
        service.deletebyId(id);
    }
}
