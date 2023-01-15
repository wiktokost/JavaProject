package com.example.ipstackwebapi.controller;


import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.service.IpGeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @RequestMapping( "/")
    public List<IpGeolocation> getAllData(){
        return service.getAll();
    }

//    @GetMapping("/")
}
