package com.javaandcloud.webserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    TestConfiguration configuration;

    @Value("${web.message}")
    String message;

    @GetMapping("/message")
    public String getMessage() {
        return configuration.getValue();
    }
}
