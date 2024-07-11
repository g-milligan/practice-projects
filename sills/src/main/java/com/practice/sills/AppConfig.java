package com.practice.sills;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Value("${addressservice.base.url}")
    private String addressBaseUrl;
  
    @Bean
    public WebClient webClient() {
        return WebClient.builder().baseUrl(addressBaseUrl).build();
    }
}