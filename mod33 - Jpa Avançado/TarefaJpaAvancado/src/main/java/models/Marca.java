package models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_MARCA")
public class Marca {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
	@SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca", initialValue = 1, allocationSize = 1)
	private int id;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@OneToMany(mappedBy = "marca")
	private List<Carro> carros;

	@OneToMany(mappedBy = "marca")
	private List<Acessorio> acessorios;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public Marca() {
		this.carros = new ArrayList<>();
		this.acessorios= new ArrayList<>();
	}

	public void addAcessorio(Acessorio acessorio) {
		this.acessorios.add(acessorio);
	}
	
	public void addCarro(Carro carro) {
		this.carros.add(carro);
	}
}
