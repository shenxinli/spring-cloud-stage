package com.chinaway.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
@EnableDiscoveryClient
public class ApplicationConfigServer {
 
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
    
}
