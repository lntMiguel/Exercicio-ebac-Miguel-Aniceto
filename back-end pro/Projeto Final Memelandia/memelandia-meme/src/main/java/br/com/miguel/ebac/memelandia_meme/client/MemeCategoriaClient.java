package br.com.miguel.ebac.memelandia_meme.client;

import br.com.miguel.ebac.memelandia_meme.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "memelandia-categorias-server", configuration = FeignConfig.class)
public interface MemeCategoriaClient {

    @RequestMapping(path = "/categorias/{id}/validar", method = RequestMethod.GET)
    @ResponseBody
    boolean validaCategoria(@PathVariable("id")String id);
}
