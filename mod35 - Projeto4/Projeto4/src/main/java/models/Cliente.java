package models;

import dao.Persistente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Persistente{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
	@SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name="NOME", nullable = false, length = 50)
	private String nome;
	
	@Column(name="CPF", nullable = false, length = 11, unique = true)
    private String cpf;
    
	@Column(name="TEL", nullable = false, length = 11)
    private String tel;
    
	@Column(name="ENDERECO", nullable = false, length = 50)
    private String endereco;
    
	@Column(name="NUMERO", nullable = false)
    private Integer numero;
    
	@Column(name="CIDADE", nullable = false, length = 50)
    private String cidade;
    
	@Column(name="ESTADO", nullable = false, length = 50)
    private String estado;
	
	@Column(name="SEXO", nullable = false, length = 1)
    private String sexo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
