package com.chinaway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {
	
	public static void main(String[] args) {
        SpringApplication.run( ServiceHiApplication.class, args );
    }

    @Value("${server.port}")
    String port;
    
    @Value("${info.scm-url}")
    String scm_url;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "shenxinli") String name) {
    	StringBuilder sb = new StringBuilder("hi " + name + " ,i am from port:" + port);
    	sb.append("<br/>" + scm_url);
        return sb.toString();
    }
    
}
