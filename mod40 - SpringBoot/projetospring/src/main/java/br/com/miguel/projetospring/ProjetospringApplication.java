package br.com.miguel.projetospring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.miguel.models.Cliente;
import br.com.miguel.repository.IClienteRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.miguel.repository")
@EntityScan("br.com.miguel.*")
@ComponentScan(basePackages = "br.com.miguel")
public class ProjetospringApplication implements CommandLineRunner{

	@Autowired
	private IClienteRepository repository;
	
	private static final Logger log = LoggerFactory.getLogger(ProjetospringApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Start Application...");
		Cliente cliente = createCliente();
		repository.save(cliente);
	}

	private Cliente createCliente() {
		
		return Cliente.builder()
				.cel("11111111111")
				.cpf("11111111111")
				.email("teste@teste.com.br")
				.nome("Miguel").build();
	}

	

}
