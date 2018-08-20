package com.chinaway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface HiService {

	@RequestMapping(value = "/hi")
	String doService(@RequestParam(value = "name", defaultValue= "shenxinli") String name);
}
