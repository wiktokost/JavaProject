package com.example.ipstackwebapi.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class IpGeolocationNotFoundException extends RuntimeException {
    public IpGeolocationNotFoundException(String message){
        super(message);
    }
}
