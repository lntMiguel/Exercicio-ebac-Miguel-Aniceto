package br.com.segundoprojeto.dao;

import br.com.segundoprojeto.domain.Cliente;
import br.com.segundoprojeto.generic.GenericDAO;

public class ClienteDao extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDao() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEndereco(entity.getEndereco());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTelefone(entity.getTelefone());
		
	}



}