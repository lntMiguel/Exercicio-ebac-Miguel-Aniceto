package br.com.pessoa;

public class PessoaJuridica extends Pessoa {
	
	public PessoaJuridica(String nome, String sexo, int idade) {
		super(nome, sexo, idade);
		// TODO Auto-generated constructor stub
	}

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
