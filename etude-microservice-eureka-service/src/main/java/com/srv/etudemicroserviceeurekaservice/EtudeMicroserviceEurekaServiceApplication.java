package com.srv.etudemicroserviceeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EtudeMicroserviceEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudeMicroserviceEurekaServiceApplication.class, args);
	}

}
