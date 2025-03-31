package br.com.miguel.ebac.miguel_zookerper_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }


}
