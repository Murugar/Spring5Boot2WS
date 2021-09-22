package com.iqmsoft.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WebsocketMain {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(WebsocketMain.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebsocketMain.class, args);
	}
}
