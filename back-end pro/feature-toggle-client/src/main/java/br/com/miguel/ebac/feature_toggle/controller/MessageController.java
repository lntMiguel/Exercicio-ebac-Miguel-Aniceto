package br.com.miguel.ebac.feature_toggle.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/mensagens")
public class MessageController {
    @Value("${message:Oi, não tenho menssagem!}")
    private String message;

    @Value("${client.ligadesliga:false}")
    private boolean flag;

    @GetMapping
    public String getMessage() {
        if(flag){
            return this.message;
        }

        return "ta desligado pae";

    }
}
