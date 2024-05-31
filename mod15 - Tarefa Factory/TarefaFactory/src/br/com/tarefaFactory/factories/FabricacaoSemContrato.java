package br.com.tarefaFactory.factories;

import br.com.tarefaFactory.models.Audi;
import br.com.tarefaFactory.models.Carro;
import br.com.tarefaFactory.models.Ford;

//Fabricação de carros para clientes sem contrato com companhia

public class FabricacaoSemContrato extends Factory {

	
	Carro retirarCarro(String gradeRequisitada) {
		
		switch(gradeRequisitada) {
			case "A":
				return new Audi(1000, "branco", "cheio");
			
			case "B":
				return new Ford(800, "roxo", "cheio");
				
			default:
				System.out.println("Grade não conhecida");
				return null;
		}
		
		
	}

}
