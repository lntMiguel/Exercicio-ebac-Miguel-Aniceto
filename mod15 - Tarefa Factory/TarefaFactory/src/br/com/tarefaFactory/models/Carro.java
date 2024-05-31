package br.com.tarefaFactory.models;

/**
 * Classe pai carro 
 */
public class Carro {
	//atributos
	String nome;
	int qtdCavalos;
	String cor;
	String qtdCombustivel;
	
	//construtor
	public Carro(String nome, int qtdCavalos, String cor, String qtdCombustivel) {
		this.nome = nome;
		this.qtdCavalos = qtdCavalos;
		this.cor = cor;
		this.qtdCombustivel = qtdCombustivel;
	}
	
	//métodos
	public void testarCarro() {
		
		System.out.println("Testes concluidos\n###################\n");
	}

	public void limparCarro() {
		System.out.println("Carro Limpo\n");
	}
	
	public void checagemMecanica() {
		System.out.println("Checagem mecanica: Não há erros\n");
	}
	
	public void combustivelCarro() {
		System.out.println("O estado do combustível é: "+ qtdCombustivel + "\n");
	}
	
	public String getNome() {
		return this.nome;
	}

}
