package br.com.miguel.ebac.animal_service.dto;

import br.com.miguel.ebac.animal_service.entidades.Funcionario;
import br.com.miguel.ebac.animal_service.entidades.Species;

import java.sql.Date;

public class AnimalDTO {

        private Integer id;
        private Integer idadeEstimada;
        private String nomeProvisorio;
        private String condicoesChegada;
        private Funcionario funcionarioRecebedor;
        private Date dataEntrada;
        private Date dataAdocao;
        private Date dataObito;
        private Species especie;

        public AnimalDTO(Integer id, Integer idadeEstimada, String nomeProvisorio, String condicoesChegada,
                         Funcionario funcionarioRecebedor, Date dataEntrada, Date dataAdocao, Date dataObito,
                         Species especie) {
            this.id = id;
            this.idadeEstimada = idadeEstimada;
            this.nomeProvisorio = nomeProvisorio;
            this.condicoesChegada = condicoesChegada;
            this.funcionarioRecebedor = funcionarioRecebedor;
            this.dataEntrada = dataEntrada;
            this.dataAdocao = dataAdocao;
            this.dataObito = dataObito;
            this.especie = especie;

        }

        public Integer getId() { return id; }
        public Integer getIdadeEstimada() { return idadeEstimada; }
        public String getNomeProvisorio() { return nomeProvisorio; }
        public String getCondicoesChegada() { return condicoesChegada; }
        public Funcionario getfuncionarioRecebedor() { return funcionarioRecebedor; }
        public Date getDataEntrada() { return dataEntrada; }
        public Date getDataAdocao() { return dataAdocao; }
        public Date getDataObito() { return dataObito; }
        public Species getEspecie() { return especie; }

    }

