package com.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.boot")
public class DubboBootProviderApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DubboBootProviderApplication.class, args);
	}
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
	        return builder.sources(DubboBootProviderApplication.class);
	    }
}
