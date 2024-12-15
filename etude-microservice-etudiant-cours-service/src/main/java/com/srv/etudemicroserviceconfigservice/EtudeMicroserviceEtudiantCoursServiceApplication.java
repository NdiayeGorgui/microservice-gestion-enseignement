package com.srv.etudemicroserviceconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EtudeMicroserviceEtudiantCoursServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudeMicroserviceEtudiantCoursServiceApplication.class, args);
	}

}
