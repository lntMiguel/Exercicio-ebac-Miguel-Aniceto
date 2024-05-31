package br.com.tarefaFactory.factories;

import br.com.tarefaFactory.models.Carro;
import br.com.tarefaFactory.models.Fiat;
import br.com.tarefaFactory.models.Nissan;

//Fabricação de carros para clientes que tem contrato com companhias 
public class FabricacaoComContrato extends Factory {

	@Override
	Carro retirarCarro(String gradeRequisitada) {
		
		
		switch(gradeRequisitada) {
		
		case "A":
			return new Fiat(1000, "verde", "cheio");
		
		case "B":
			return new Nissan(800, "vermelho", "cheio");
			
		
		default:
			System.out.println("Grade não conhecida");
			return null;
		
		}
	}
}
