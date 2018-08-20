package com.chinaway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RestController
@PropertySource(value= {"classpath:demo.properties"})
public class AdminClientApplication {
 
	@Value("${demo.value}")
	private String hello;
	
    public static void main(String[] args) {
        SpringApplication.run(AdminClientApplication.class, args);
    }
    
    @RequestMapping(value="/")
    public String hello() {
    	return hello;
    }
    
}
