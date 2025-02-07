package com.dominio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DominioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DominioApplication.class, args);
	}

}
