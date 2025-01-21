package br.com.miguel.ebac.animal_service.dto;

import br.com.miguel.ebac.animal_service.entidades.Funcionario;

import java.sql.Date;

public class DogDTO {
    private Integer id;
    private Integer idadeEstimada;
    private String nomeProvisorio;
    private String condicoesChegada;
    private Funcionario funcionarioRecebedor;
    private Date dataEntrada;
    private Date dataAdocao;
    private String raca;
    private String porte;

    public DogDTO(Integer id, Integer idadeEstimada, String nomeProvisorio, String condicoesChegada, Funcionario funcionarioRecebedor, Date dataEntrada, Date dataAdocao, String raca, String porte) {
        this.id = id;
        this.idadeEstimada = idadeEstimada;
        this.nomeProvisorio = nomeProvisorio;
        this.condicoesChegada = condicoesChegada;
        this.funcionarioRecebedor = funcionarioRecebedor;
        this.dataEntrada = dataEntrada;
        this.dataAdocao = dataAdocao;
        this.raca = raca;
        this.porte = porte;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public Funcionario getFuncionarioRecebedor() {
        return funcionarioRecebedor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public String getRaca() {
        return raca;
    }

    public String getPorte() {
        return porte;
    }

}
