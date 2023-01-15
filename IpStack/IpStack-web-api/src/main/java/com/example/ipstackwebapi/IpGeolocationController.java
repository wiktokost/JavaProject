package com.example.ipstackwebapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
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
