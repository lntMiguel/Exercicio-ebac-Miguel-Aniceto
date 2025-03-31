package br.com.miguel.ebac.memelandia_categorias.controller;

import br.com.miguel.ebac.memelandia_categorias.models.Categoria;
import br.com.miguel.ebac.memelandia_categorias.service.CategoriaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoriaController.class);

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria saveCategoria(@RequestBody Categoria categoria) throws Exception {
        LOGGER.info("Criando Categoria");
        return categoriaService.saveCategoria(categoria);
    }
}
