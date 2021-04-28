package com.javaandcloud.webserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "web")
public class TestConfiguration {

    @Value("${web.message}")
    String message;

    public String getValue() {
        return message;
    }

    public void setValue(String message) {
        this.message = message;
    }
}
