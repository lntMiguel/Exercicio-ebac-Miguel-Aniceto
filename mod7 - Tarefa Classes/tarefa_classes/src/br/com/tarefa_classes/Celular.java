package br.com.tarefa_classes;

public class Celular {
	private String modelo;
	private String marca;
	private String cor;
	private int tamanhoDoArmazenamento;
	private int qtdDeCamera;

	
	//construtor
	public Celular(String modelo, String marca, String cor, int tamanhoDoArmazenamento, int qtdDeCamera) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.tamanhoDoArmazenamento = tamanhoDoArmazenamento;
		this.qtdDeCamera = qtdDeCamera;
	}

	//getters e setters 
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanhoDoArmazenamento() {
		return tamanhoDoArmazenamento;
	}

	public void setTamanhoDoArmazenamento(int tamanhoDoArmazenamento) {
		this.tamanhoDoArmazenamento = tamanhoDoArmazenamento;
	}

	public int getQtdDeCamera() {
		return qtdDeCamera;
	}

	public void setQtdDeCamera(int qtdDeCamera) {
		this.qtdDeCamera = qtdDeCamera;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Exibe uma mensagem dizendo os atributos do celular 
	 * @param celular
	 */
	public void exibirCelular(Celular celular) {
		System.out.println("O celular " + celular.modelo + " da marca " + celular.marca + " de cor " 
							+ celular.cor + ", tem " + celular.tamanhoDoArmazenamento + "gbs de memória e "
							+ celular.qtdDeCamera + " câmeras.");
	}
}


