package br.com.miguel.ebac.estrangulamento.novo_servico.controllers;

import br.com.miguel.ebac.estrangulamento.novo_servico.entidades.Usuario;
import br.com.miguel.ebac.estrangulamento.novo_servico.servicos.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuario {

    private final ServicoUsuario servicoUsuario;

    public ControllerUsuario(ServicoUsuario servicoUsuario) {
        this.servicoUsuario = servicoUsuario;
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return servicoUsuario.criarUsuario(usuario);
    }

    @GetMapping
    public Iterable<Usuario> encontrarTodos(){
        return servicoUsuario.encontrarTodos();
    }
}
