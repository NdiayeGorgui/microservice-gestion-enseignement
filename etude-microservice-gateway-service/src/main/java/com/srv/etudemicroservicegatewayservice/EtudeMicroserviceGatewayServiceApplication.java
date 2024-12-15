package com.srv.etudemicroservicegatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient

@SpringBootApplication
public class EtudeMicroserviceGatewayServiceApplication {
	/*
	 * @Bean RouteLocator routes(RouteLocatorBuilder builder) { return
	 * builder.routes().route(r->r .path("/countries/**") .filters(f->f
	 * .addRequestHeader("X-RapidAPI-Host", "restcountries-v1.p.rapidapi.com")
	 * .addRequestHeader("X-RapidAPI-Key",
	 * "b338a33f53msh567a9379aeadcf5p17164ejsn78ba0715ec4d")
	 * .rewritePath("/countries/(?<segment>.*)", "/${segment}") )
	 * .uri("https://restcountries-v1.p.rapidapi.com/all") //.id("countries") )
	 * .build(); }
	 */
	@Bean
	DiscoveryClientRouteDefinitionLocator dymamicRoutes(ReactiveDiscoveryClient rdc,
														DiscoveryLocatorProperties dlp){
		return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
	}
	public static void main(String[] args) {
		SpringApplication.run(EtudeMicroserviceGatewayServiceApplication.class, args);
	}

}
