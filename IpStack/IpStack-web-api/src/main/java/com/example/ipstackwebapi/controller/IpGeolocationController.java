package com.example.ipstackwebapi.controller;

import com.example.ipstackdata.model.IpGeolocation;
import com.example.ipstackwebapi.contract.IpGeolocationDto;
import com.example.ipstackwebapi.controller.exceptions.IpGeolocationNotFoundException;
import com.example.ipstackwebapi.service.IpGeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class IpGeolocationController {
    private final IpGeolocationService service;

    @Autowired
    public IpGeolocationController(IpGeolocationService service) {
        this.service = service;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Object> getIpById(@PathVariable("id") Long id){
        Optional<IpGeolocation> ipGeolocation = service.getId(id);
        if (ipGeolocation.isPresent()){
            return new ResponseEntity<>(ipGeolocation.get(), HttpStatus.OK);
        }
        else {
            throw new IpGeolocationNotFoundException("IpGeolocation id not found");
        }
    }

    @GetMapping( "/all")
    public ResponseEntity<Object> getAllData(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> saveIpStack(@RequestBody IpGeolocationDto ipStack){
        var id =service.addIpStack(ipStack);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
