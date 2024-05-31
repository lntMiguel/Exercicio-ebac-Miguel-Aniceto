package br.com.tarefaFactory.view;

import br.com.tarefaFactory.factories.FabricacaoComContrato;
import br.com.tarefaFactory.factories.FabricacaoSemContrato;
import br.com.tarefaFactory.factories.Factory;
import br.com.tarefaFactory.models.Carro;
import br.com.tarefaFactory.models.Cliente;

public class Demo {

	public static void main(String[] args) {
		
		//cliente requisita grade A e tem contrato com companhia
		Cliente cliente = new Cliente("A", true);
		
		//cliente requisita grade B e tem contrato com companhia
		Cliente cliente2 = new Cliente("B", true);
		
		//cliente requisita grade A e não tem contrato com companhia
		Cliente cliente3 = new Cliente("A", false);
		
		//cliente requisita grade B e não tem contrato com companhia
		Cliente cliente4 = new Cliente("B", false);

		//Verifica se o carro vai ser feito em uma companhia com contrato ou sem contrato
		Factory factory = getCompanhiaCarro(cliente);
		Factory factory2 = getCompanhiaCarro(cliente2);
		Factory factory3 = getCompanhiaCarro(cliente3);
		Factory factory4 = getCompanhiaCarro(cliente4);
		
		//criação dos carros
		Carro carro = factory.criar(cliente.getGradeRequisitada());
		carro.testarCarro();
		
		Carro carro2 = factory2.criar(cliente2.getGradeRequisitada());
		carro2.testarCarro();
		
		Carro carro3 = factory3.criar(cliente3.getGradeRequisitada());
		carro3.testarCarro();
		
		Carro carro4 = factory4.criar(cliente4.getGradeRequisitada());
		carro4.testarCarro();
		
	}

	//Verifica se o carro vai ser feito em uma companhia com contrato ou sem contrato
	private static Factory getCompanhiaCarro(Cliente cliente) {
		
		//se o cliente tem contrato com companhia
		if(cliente.hasTemContradoDeCompanhia()) 
			return new FabricacaoComContrato();
		
		//caso não tenha
		else 
			return new FabricacaoSemContrato();
		
	}
}
