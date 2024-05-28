package br.com.tarefaFactory;

/**
 * Classe pai carro 
 */
public class Carro {
	//atributos
	int cavalos;
	String cor;
	String qtdCombustivel;
	
	//construtor
	public Carro(int cavalos, String cor, String qtdCombustivel) {
		this.cavalos = cavalos;
		this.cor = cor;
		this.qtdCombustivel = qtdCombustivel;
	}
	
	//método
	public void testarCarro() {
		System.out.println("Testes concluidos");
	}

	public void limparCarro() {
		System.out.println("Carro Limpo");
	}
	
	public void checagemMecanica() {
		System.out.println("Checagem mecanica: Não há erros");
	}
	
	public void combustivelCarro() {
		System.out.println("O estado do combustível é: "+ qtdCombustivel);
	}
	
	

}
