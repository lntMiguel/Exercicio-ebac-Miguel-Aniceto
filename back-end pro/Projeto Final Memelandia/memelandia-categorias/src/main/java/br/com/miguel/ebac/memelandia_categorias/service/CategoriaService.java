package br.com.miguel.ebac.memelandia_categorias.service;

import br.com.miguel.ebac.memelandia_categorias.client.UserClient;
import br.com.miguel.ebac.memelandia_categorias.models.Categoria;
import br.com.miguel.ebac.memelandia_categorias.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@EnableMongoRepositories(basePackageClasses = CategoriaRepository.class)
@Component
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private UserClient userClient;

    public Categoria saveCategoria(Categoria categoria) throws Exception {

        if(!userClient.validaUser(categoria.getIdUsuario())){
            throw new Exception("Usuario nao logado ou inexistente");
        }

        else{
            return  categoriaRepository.save(categoria);
        }

    }
}
