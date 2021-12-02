package com.javatechie.spring.rest.api.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.javatechie.spring.rest.api.resource.CafetoTestResource;

@Component
public class RestConfig extends ResourceConfig{

	public RestConfig(Class<?>... classes) {
		register(CafetoTestResource.class);
	}
	
	

}
