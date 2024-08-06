package models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CARRO")
public class Carro {

	public Carro() {
		this.acessorios = new ArrayList<>();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
	@SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
	private int id;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "cambio", length = 10, nullable = false)
	private String cambio; // Manual, Automatico

	@Column(name = "tipo", length = 9, nullable = false)
	private String tipo; // Combustão, Eletrico, Hibrido

	@Column(name = "potencia", nullable = false)
	private Double potencia; // Em cavalos

	@ManyToOne
	@JoinColumn(name = "id_marca_fk", referencedColumnName = "id", nullable = false)
	private Marca marca;

	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "TB_CARRO_ACESSORIO", 
        joinColumns = { @JoinColumn(name = "id_carro_fk") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_acessorio_fk") }
    )
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

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public void add(Acessorio acessorio) {
		this.acessorios.add(acessorio);
	}
	
}
