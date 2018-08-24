package com.chinaway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chinaway.config.ServiceInfo;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ServiceHiApplication {
	
	@Autowired
	private ServiceInfo serviceInfo;
	
	public static void main(String[] args) {
        SpringApplication.run( ServiceHiApplication.class, args );
    }

    @Value("${server.port}")
    String port;
    
    @Value("${info.scm-url}")
    String scm_url;
    
    @Value("${info.build-url}")
    String build_url;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "shenxinli") String name) {
    	StringBuilder sb = new StringBuilder("hi " + name + " ,i am from host is " + 
    									serviceInfo.getIpAddress() + ":" + serviceInfo.getServerPort());
    	sb.append("<br/>scm-url is: " + scm_url);
    	sb.append("<br/>build-url is: " + build_url);
        return sb.toString();
    }
    
}
