package br.com.miguel.ebac.filas.service;

import br.com.miguel.ebac.filas.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceRabbitMQ {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviaMensagem(String mensagem){
        rabbitTemplate.convertAndSend(ConfiguracaoRabbitMQ.NOME_EXCHANGE, "miguel.ebac.rota.mensagem", mensagem);
    }

}
