package br.com.miguel.ebac.estrangulamento.novo_servico.repositorio;

import br.com.miguel.ebac.estrangulamento.novo_servico.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioUsuario extends CrudRepository<Usuario, String> {
}
