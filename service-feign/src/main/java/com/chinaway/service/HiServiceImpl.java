package com.chinaway.service;

import org.springframework.stereotype.Component;

@Component
public class HiServiceImpl implements HiService {

	@Override
	public String doService(String name) {
		// TODO Auto-generated method stub
		return "hi,"+name+",sorry,error!";
	}

}
