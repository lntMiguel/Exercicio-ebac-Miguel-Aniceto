package br.com.miguel.ebac.memelandia_categorias_server.service;

import br.com.miguel.ebac.memelandia_categorias_server.models.Categoria;
import br.com.miguel.ebac.memelandia_categorias_server.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@EnableMongoRepositories(basePackageClasses = CategoriaRepository.class)
@Component
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria findById(String id) throws Exception {

        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        return categoriaOptional.orElse(null);
    }

    public boolean validaCategoria(String id){
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        return categoriaOptional.isPresent();
    }


}
