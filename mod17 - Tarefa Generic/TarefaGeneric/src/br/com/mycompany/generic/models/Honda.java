package br.com.mycompany.generic.models;

public class Honda implements ICarroPersistente{

	private String nome;
	private String placa;
	private int nmrPortas;
	
	public Honda(String nome, String placa, int nmrPortas) {
		super();
		this.nome = nome;
		this.placa = placa;
		this.nmrPortas = nmrPortas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNmrPortas() {
		return nmrPortas;
	}

	public void setNmrPortas(int nmrPortas) {
		this.nmrPortas = nmrPortas;
	}

	@Override
	public String buscarPlaca() {
		// TODO Auto-generated method stub
		return this.placa;
	}
	
	
}
