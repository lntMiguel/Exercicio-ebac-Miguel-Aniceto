package br.com.miguel.ebac.eventos.produtor;

import br.com.miguel.ebac.eventos.service.ServicoEnvioDeMensagensKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class ProdutorController {

    @Autowired
    private ServicoEnvioDeMensagensKafka servicoEnvioDeMensagensKafka;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem){
        servicoEnvioDeMensagensKafka.enviarMensagem(mensagem);
    }

}
