package com.practice.sills.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.practice.sills.responses.AddressResponse;

@Service
public class WebClientService {
    @Autowired
    private WebClient webClient;
 
    public AddressResponse getEmployeeById(int id) {
 
        // Using WebClient
        return webClient.get().uri("todos/" + id).retrieve()
            .bodyToMono(AddressResponse.class).block();
    }
}
