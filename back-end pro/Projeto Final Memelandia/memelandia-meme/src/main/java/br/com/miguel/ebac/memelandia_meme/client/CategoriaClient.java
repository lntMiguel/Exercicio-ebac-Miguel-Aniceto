package br.com.miguel.ebac.memelandia_meme.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoriaClient.class);

    @Autowired
    private MemeCategoriaClient memeCategoriaClient;


    public boolean validarCategoria(String id){
        LOGGER.info("Validando categoria: {}", id);
        return memeCategoriaClient.validaCategoria(id);
    }
}
