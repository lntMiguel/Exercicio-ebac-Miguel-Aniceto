package br.com.miguel.ebac.filas.consumidor;

import br.com.miguel.ebac.filas.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {

    @RabbitHandler
    public void consumirMensagem(String mensagem){
        System.out.println("=============== RECEBENDO MENSAGEM ===================");
        System.out.println("===============" + mensagem + "===================");
        System.out.println("=============== FIM RECEBENDO MENSAGEM ===================");


    }


}
