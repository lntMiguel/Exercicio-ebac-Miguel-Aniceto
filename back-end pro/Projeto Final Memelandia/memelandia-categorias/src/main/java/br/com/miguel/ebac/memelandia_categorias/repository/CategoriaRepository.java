package br.com.miguel.ebac.memelandia_categorias.repository;


import br.com.miguel.ebac.memelandia_categorias.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, String> {

}
