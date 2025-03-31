package br.com.miguel.ebac.miguel_gateway_api.routing;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguradorRotas {

    @Bean
    public RouteLocator minhasRotas(RouteLocatorBuilder builder){
        return builder.routes()
                .route("get-route", p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Oi", "Miguel"))
                        .uri("http://httpbin.org"))
                .route("miguel-host", p -> p
                        .host("*.miguel.com.br")
                        .filters(f -> f.addRequestHeader("Origem", "site do Miguel"))
                        .uri("http://httpbin.org"))
                .build();
    }
}
