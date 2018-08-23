package com.chinaway.config;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ServiceInfo implements ApplicationListener<WebServerInitializedEvent> {

	private int serverPort;
	private String ipAddress = "127.0.0.1";
	
	@Override
	public void onApplicationEvent(WebServerInitializedEvent event) {
		// TODO Auto-generated method stub
		this.serverPort = event.getWebServer().getPort();
		try {
			this.ipAddress = Inet4Address.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getServerPort() {
		return this.serverPort;
	}
	
	public String getIpAddress() {
		return this.ipAddress;
	}
	
}
