package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("userService", predicateSpec ->
                        predicateSpec.path("/user").uri("http://localhost:8050/"))
                .route("authService", predicateSpec ->
                        predicateSpec.path("/auth/**").uri("lb://authen"))
                .route("commodityService", predicateSpec ->
                        predicateSpec.path("/commodity").uri("http://localhost:8030"))
                .build();
    }

//    @Bean
//    public GlobalFilter customGlobalFilter() {
//        return (exchange, chain) -> exchange.getPrincipal()
//                .map(Principal::getName)
//                .defaultIfEmpty("Default User")
//                .map(userName -> {
//                    //adds header to proxied request
//                    exchange.getRequest().mutate().header("CUSTOM-REQUEST-HEADER", userName).build();
//                    return exchange;
//                })
//                .flatMap(chain::filter);
//    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }
}
