package br.com.miguel.ebac.memelandia_users.controller;

import br.com.miguel.ebac.memelandia_users.models.User;
import br.com.miguel.ebac.memelandia_users.service.UserService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){

        LOGGER.info("Usuario gerado");

        return userService.saveUser(user);

    }

    @GetMapping
    public List<User> listarTodos(){

        LOGGER.info("Entregando todos os usuarios");

        return userService.listarTodos();

    }

    @GetMapping("{id}/findBy")
    public boolean findById(@PathVariable  String id){

        LOGGER.info("Retornando se o usuario existe ou nao");
        return  userService.findById(id);


    }

}
