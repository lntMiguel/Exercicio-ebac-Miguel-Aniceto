package br.com.tarefaFactory;

public class Demo {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("A", true);
		Factory factory = getCompanhiaCarro(cliente);
		
		Carro carro = factory.criar(cliente.getGradeRequisitada());
		carro.testarCarro();
	}

	private static Factory getCompanhiaCarro(Cliente cliente) {
		if(cliente.hasTemContradoDeCompanhia()) {
			return new FabricaCompanhia();
		}
		
		else {
			return new FabricaDeCarro();
		}
	}
}
