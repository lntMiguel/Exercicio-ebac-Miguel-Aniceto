package br.com.miguel.ebac.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServicoEnvioDeMensagensKafka {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.miguel.nome.topico}")
    private String nomeTopico;

    public void enviarMensagem(String mensagem){
        System.out.println("=======================ENVIANDO MENSAGEM " + mensagem + "=======================");

        kafkaTemplate.send(nomeTopico, mensagem);

    }

}
