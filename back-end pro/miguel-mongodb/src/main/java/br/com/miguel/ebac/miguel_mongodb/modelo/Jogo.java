package br.com.miguel.ebac.miguel_mongodb.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Jogo")
public class Jogo {

    @Id
    private String id;

    private String nome;

    private String distibuidora;

    private String desenvolvedor;

    private String plataforma;

    public Jogo(String nome, String distibuidora, String desenvolvedor, String plataforma) {
        this.nome = nome;
        this.distibuidora = distibuidora;
        this.desenvolvedor = desenvolvedor;
        this.plataforma = plataforma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistibuidora() {
        return distibuidora;
    }

    public void setDistibuidora(String distibuidora) {
        this.distibuidora = distibuidora;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
