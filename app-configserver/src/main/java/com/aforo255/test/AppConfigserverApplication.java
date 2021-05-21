package com.aforo255.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConfigserverApplication.class, args);
	}

}
