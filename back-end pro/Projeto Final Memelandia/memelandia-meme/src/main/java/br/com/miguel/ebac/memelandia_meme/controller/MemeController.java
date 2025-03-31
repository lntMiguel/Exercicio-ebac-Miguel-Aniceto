package br.com.miguel.ebac.memelandia_meme.controller;

import br.com.miguel.ebac.memelandia_meme.models.Meme;
import br.com.miguel.ebac.memelandia_meme.service.MemeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meme")
public class MemeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemeController.class);

    @Autowired
    private MemeService memeService;

    @PostMapping
    public Meme saveMeme(@RequestBody Meme meme) throws Exception {
        LOGGER.info("Criando Meme");
        return memeService.saveMeme(meme);
    }

    @GetMapping
    public List<Meme> listarTodos(){
        LOGGER.info("Listando todos os memes");
        return memeService.listaTodosMemes();
    }

    @GetMapping("/memeDoDia")
    public Meme memeDoDia(){
        LOGGER.info("Retornando meme do dia");
        return memeService.memeDoDia();

    }

}
