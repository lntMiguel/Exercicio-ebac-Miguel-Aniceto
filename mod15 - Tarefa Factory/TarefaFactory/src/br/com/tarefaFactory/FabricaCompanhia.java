package br.com.tarefaFactory;

public class FabricaCompanhia extends Factory {

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
