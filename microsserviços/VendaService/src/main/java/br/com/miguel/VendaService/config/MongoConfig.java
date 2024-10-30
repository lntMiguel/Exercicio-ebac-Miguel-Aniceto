package br.com.miguel.VendaService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Configuration
@EnableMongoRepositories(basePackages = "br.com.miguel.VendaService.repository")
public class MongoConfig {

}