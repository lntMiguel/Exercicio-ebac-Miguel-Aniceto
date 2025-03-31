package br.com.miguel.ebac.eventos.consumidor;


import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumidor {

    @KafkaListener(topics = "${kafka.miguel.nome.topico}", groupId = "miguelGroup")
    @RetryableTopic(attempts = "2")
    public void consumirMensagem(String mensagem){

        if(mensagem.contains("DLT")){
            throw new IllegalArgumentException("Teste de DLT");
        }

        System.out.println("=======================RECEBENDO MENSAGEM=======================");
        System.out.println("======================= " + mensagem + " =======================");
        System.out.println("=======================FIM RECEBENDO MENSAGEM=======================");


    }

    @DltHandler
    public void consumirMensagemDLT(String mensagem){
        System.out.println("\n=======================RECEBENDO MENSAGEM NA DLT=======================\n");
        System.out.println("\n======================= " + mensagem + " =======================\n");
        System.out.println("\n=======================FIM RECEBENDO MENSAGEM NA DLT=======================\n");
    }

}
