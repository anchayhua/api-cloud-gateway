package com.quique.apicloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCloudGatewayApplication.class, args);
	}

	// @Bean
	// public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
	// 	return builder.routes()
	// 			.route(r -> r.path("/function/**")
	// 					.filters(f -> f
	// 						// .prefixPath("/function")
	// 						.stripPrefix(1)
	// 						.addResponseHeader("X-Powered-By","Quique Gateway Service Function")
	// 					)
	// 					.uri("http://localhost:8081")
	// 			)
	// 			.route(r -> r.path("/reactive/**")
	// 					.filters(f -> f
	// 						// .prefixPath("/reactive")
	// 						.stripPrefix(1)
	// 						.addResponseHeader("X-Powered-By","Quique Gateway Service Reactive")
	// 					)
	// 					.uri("http://localhost:8082")
	// 			)
	// 			.build();
	// }
	
	/*
	 * http://localhost:8080/function/api/greeting
	 * http://localhost:8080/reactive/api/greet
	 */
}