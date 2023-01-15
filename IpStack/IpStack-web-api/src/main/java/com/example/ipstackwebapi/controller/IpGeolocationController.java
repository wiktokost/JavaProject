package com.example.ipstackwebapi.controller;

import com.example.ipstackwebapi.service.IpGeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

    @RequestMapping( "/all")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(service.getAll());
    }

//    @GetMapping("/")
}
