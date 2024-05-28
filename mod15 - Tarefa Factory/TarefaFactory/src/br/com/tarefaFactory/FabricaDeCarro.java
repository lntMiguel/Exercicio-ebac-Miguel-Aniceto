package br.com.tarefaFactory;

public class FabricaDeCarro extends Factory {

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
