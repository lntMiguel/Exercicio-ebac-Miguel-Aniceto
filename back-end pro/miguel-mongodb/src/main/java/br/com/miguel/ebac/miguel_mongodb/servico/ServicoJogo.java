package br.com.miguel.ebac.miguel_mongodb.servico;

import br.com.miguel.ebac.miguel_mongodb.modelo.Jogo;
import br.com.miguel.ebac.miguel_mongodb.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = JogoRepository.class)
public class ServicoJogo {
    @Autowired
    private JogoRepository jogoRepository;

    public Jogo criarJogo(Jogo jogo){

        return jogoRepository.insert(jogo);

    }

    public long count(){
        return jogoRepository.count();
    }
}
