package br.com.miguel.ebac.eventos.configuracao;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopico {

    @Value("${kafka.miguel.nome.topico}")
    private String nomeTopicoMiguel;

    @Bean
    public NewTopic topicoMiguel(){
        return TopicBuilder.name(nomeTopicoMiguel).partitions(3).replicas(2).build();
    }

}
