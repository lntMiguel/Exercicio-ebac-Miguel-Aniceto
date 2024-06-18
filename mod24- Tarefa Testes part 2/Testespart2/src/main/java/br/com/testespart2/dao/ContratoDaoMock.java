package br.com.testespart2.dao;

public class ContratoDaoMock implements IContratoDao {

	public ContratoDaoMock() {
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
