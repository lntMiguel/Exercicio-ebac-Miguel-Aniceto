package br.com.miguel.ebac.miguel_zookerper_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class MiguelZookerperClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiguelZookerperClientApplication.class, args);
	}

}
