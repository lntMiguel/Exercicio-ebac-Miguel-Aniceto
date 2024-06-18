package br.com.testespart2.models;

public class Cliente {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarNome(String nome) {
	
		setNome(nome);
	
	}

}
