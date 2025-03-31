package br.com.miguel.ebac.miguel_mongodb.repository;


import br.com.miguel.ebac.miguel_mongodb.modelo.Jogo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JogoRepository extends MongoRepository<Jogo, String> {

    long count();

}
