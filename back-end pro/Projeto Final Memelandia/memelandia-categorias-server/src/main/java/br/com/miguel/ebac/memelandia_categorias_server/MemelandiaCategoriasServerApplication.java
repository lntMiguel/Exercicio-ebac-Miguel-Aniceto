package br.com.miguel.ebac.memelandia_categorias_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
public class MemelandiaCategoriasServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaCategoriasServerApplication.class, args);
	}

}
