package br.com.testespart2.dao;

public class ClienteDaoMock implements IClienteDao {

	
	public ClienteDaoMock() {
		super();
	}

	@Override
	public boolean salvar() {
        
		throw new UnsupportedOperationException("Não funciona sem banco");
       
            }

	@Override
	public boolean buscar() {
		throw new UnsupportedOperationException("Não funciona sem banco");
	}

	@Override
	public boolean atualizar() {
		throw new UnsupportedOperationException("Não funciona sem banco");
	}

	@Override
	public boolean excluir() {
		throw new UnsupportedOperationException("Não funciona sem banco");
	}

}
