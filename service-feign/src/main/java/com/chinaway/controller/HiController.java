package com.chinaway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chinaway.service.HiService;

@RestController
public class HiController {

	@Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(name="name", defaultValue="shenxinli") String name) {
        return hiService.doService(name + "[feign]");
    }
    
}
