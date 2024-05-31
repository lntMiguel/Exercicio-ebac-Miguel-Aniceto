package br.com.tarefaFactory.factories;

import br.com.tarefaFactory.models.Carro;

/**
 * Classe pai Factoty / cria, prepara e retira o carro
 */

public abstract class Factory {
	
	public Carro criar(String gradeRequisitada) {
		Carro carro = retirarCarro(gradeRequisitada);
		carro = prepararCarro(carro);
		System.out.println("Carro " + carro.getNome() + " Criado\n");
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
