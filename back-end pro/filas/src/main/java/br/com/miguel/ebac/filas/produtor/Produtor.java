package br.com.miguel.ebac.filas.produtor;

import br.com.miguel.ebac.filas.service.ServiceRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class Produtor {

    @Autowired
    private ServiceRabbitMQ serviceRabbitMQ;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem){
            System.out.println("=============== Enviando Mensagem: " + mensagem);

            serviceRabbitMQ.enviaMensagem(mensagem);

    }




}
