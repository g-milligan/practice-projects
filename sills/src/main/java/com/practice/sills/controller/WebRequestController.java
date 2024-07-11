package com.practice.sills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.sills.responses.AddressResponse;
import com.practice.sills.service.WebClientService;

@RestController
@RequestMapping(path = "/web")
public class WebRequestController {
    @Autowired
    private WebClientService client;

    @GetMapping
    public AddressResponse getAddress() {
        return client.getEmployeeById(1);
    }
}
