package br.com.tarefaFactory;

public class Cliente {

	private String gradeRequisitada;
	private boolean temContrado;
	
	public Cliente(String gradeRequisitada, boolean temContradoDeCompanhia) {
		this.gradeRequisitada = gradeRequisitada;
		this.temContrado= temContradoDeCompanhia;
	}

	public String getGradeRequisitada() {
		return gradeRequisitada;
	}

	public boolean hasTemContradoDeCompanhia() {
		return temContrado;
	}

	

}
