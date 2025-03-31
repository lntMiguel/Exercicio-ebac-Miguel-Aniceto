package br.com.miguel.ebac.memelandia_meme.repository;

import br.com.miguel.ebac.memelandia_meme.models.Meme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemeRepository extends MongoRepository<Meme, String> {
}
