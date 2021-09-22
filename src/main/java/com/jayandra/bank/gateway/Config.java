package com.jayandra.bank.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route("appdemo", rt -> rt.path("/")
                        .uri("http://localhost:8080/"))
                .route("gawa", rt -> rt.path("/api/v1/student")
                        .uri("http://10.10.30.31:7005"))
                .build();

    }
}
