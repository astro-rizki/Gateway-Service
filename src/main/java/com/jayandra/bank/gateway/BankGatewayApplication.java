package com.jayandra.bank.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankGatewayApplication.class, args);
	}

}
