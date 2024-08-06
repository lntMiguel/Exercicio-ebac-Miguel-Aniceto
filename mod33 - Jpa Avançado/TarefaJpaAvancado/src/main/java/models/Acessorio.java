package models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_seq")
	@SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
	private int id;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "descricao", length = 50, nullable = false)
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "id_marca_fk", referencedColumnName = "id", nullable = false)
	private Marca marca;
	
	@ManyToMany(mappedBy = "acessorios")
	private List<Carro> carros;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Acessorio() {
		this.carros = new ArrayList<>();
	}

	public void add(Carro carro) {
		this.carros.add(carro);
	}
}
