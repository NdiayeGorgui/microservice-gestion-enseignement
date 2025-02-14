package com.srv.etudemicroserviceenseignantservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
@EnableEurekaClient
@FeignClient
@SpringBootApplication
public class EtudeMicroserviceEnseignantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudeMicroserviceEnseignantServiceApplication.class, args);
	}

}
