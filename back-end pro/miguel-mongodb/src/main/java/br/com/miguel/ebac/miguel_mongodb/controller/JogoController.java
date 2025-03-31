package br.com.miguel.ebac.miguel_mongodb.controller;

import br.com.miguel.ebac.miguel_mongodb.modelo.Jogo;
import br.com.miguel.ebac.miguel_mongodb.servico.ServicoJogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    @Autowired
    private ServicoJogo servicoJogo;

    @PostMapping
    public Jogo criaJogo(@RequestBody Jogo jogo){
        return servicoJogo.criarJogo(jogo);
    }

    @GetMapping("/count")
    public Long contaJogos(){
        return servicoJogo.count();
    }
}

