package com.soap.bootcamp2.controller;

import com.soap.bootcamp2.model.GetCarRequest;
import com.soap.bootcamp2.model.GetCarResponse;
import com.soap.bootcamp2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarController {

    @Autowired
    private CarService carService;
    
    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCarRequest(@RequestPayload GetCarRequest request) {
        GetCarResponse response = new GetCarResponse();
        response.setCar(carService.getCar(request.getCarId()));
        return response;
    }
}
