package br.com.miguel.ebac.memelandia_users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MemelandiaUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaUsersApplication.class, args);
	}

}
