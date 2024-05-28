package br.com.tarefaFactory;

/**
 * Classe pai Factoty / cria, prepara e retira o carro
 */

public abstract class Factory {
	
	public Carro criar(String gradeRequisitada) {
		Carro carro = retirarCarro(gradeRequisitada);
		carro = prepararCarro(carro);
		return carro;
	}
	
	public Carro prepararCarro(Carro carro) {
		
		carro.checagemMecanica();
		carro.combustivelCarro();
		carro.limparCarro();
		
		return carro;
	}
	
	abstract Carro retirarCarro(String gradeRequisitada);
}
