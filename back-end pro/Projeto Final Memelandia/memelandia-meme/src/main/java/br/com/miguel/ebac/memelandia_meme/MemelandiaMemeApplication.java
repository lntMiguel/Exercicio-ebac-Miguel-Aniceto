package br.com.miguel.ebac.memelandia_meme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MemelandiaMemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaMemeApplication.class, args);
	}

}
