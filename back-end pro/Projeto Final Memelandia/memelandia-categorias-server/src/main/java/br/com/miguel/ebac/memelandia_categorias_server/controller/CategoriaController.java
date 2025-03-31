package br.com.miguel.ebac.memelandia_categorias_server.controller;

import br.com.miguel.ebac.memelandia_categorias_server.models.Categoria;
import br.com.miguel.ebac.memelandia_categorias_server.service.CategoriaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoriaController.class);

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/findAll")
    public List<Categoria> findAll(){
        LOGGER.info("=====Listando Categorias=====");
        return categoriaService.listarCategorias();
    }

    @GetMapping("/findById/{id}")
    public Categoria findById(@PathVariable String id) throws Exception{
        LOGGER.info("===== Buscando por ID: {} =====", id);
        return categoriaService.findById(id);
    }

    @GetMapping("/{id}/validar")
    public boolean validaCategoria(@PathVariable String id){
        LOGGER.info("===== Validando categoria: {} =====", id);
        return categoriaService.validaCategoria(id);
    }

}
