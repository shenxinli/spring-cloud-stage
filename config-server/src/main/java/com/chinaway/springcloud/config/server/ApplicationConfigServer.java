package com.chinaway.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@ComponentScan("com.chinaway")
public class ApplicationConfigServer {
 
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
    
}
