package br.com.miguel.ebac.memelandia_categorias_server.repository;

import br.com.miguel.ebac.memelandia_categorias_server.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}
