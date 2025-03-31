package br.com.miguel.ebac.estrangulamento.novo_servico.servicos;

import br.com.miguel.ebac.estrangulamento.novo_servico.entidades.Usuario;
import br.com.miguel.ebac.estrangulamento.novo_servico.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Iterable<Usuario> encontrarTodos(){
        return repositorioUsuario.findAll();
    }

    public Usuario criarUsuario(Usuario usuario){
        return repositorioUsuario.save(usuario);
    }
}
