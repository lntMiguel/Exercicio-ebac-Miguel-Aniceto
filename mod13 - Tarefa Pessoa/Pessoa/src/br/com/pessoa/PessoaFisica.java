package br.com.pessoa;

public class PessoaFisica extends Pessoa {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String sexo, int idade, String cpf) {
		super(nome, sexo, idade);
		this.cpf = cpf;
	}
	
}
