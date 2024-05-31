package br.com.tarefaFactory.models;

public class Cliente {

	private String gradeRequisitada;
	private boolean temContratocomCompanhia;
	
	public Cliente(String gradeRequisitada, boolean temContradoDeCompanhia) {
		this.gradeRequisitada = gradeRequisitada;
		this.temContratocomCompanhia= temContradoDeCompanhia;
	}

	public String getGradeRequisitada() {
		return gradeRequisitada;
	}

	public boolean hasTemContradoDeCompanhia() {
		return temContratocomCompanhia;
	}

	

}
