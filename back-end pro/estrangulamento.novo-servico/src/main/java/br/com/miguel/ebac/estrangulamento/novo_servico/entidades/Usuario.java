package br.com.miguel.ebac.estrangulamento.novo_servico.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.util.UUID;

@Entity
public class Usuario {

    @Id
    private String id;

    private String nome;
    private String login;
    private Integer idade;
    private Integer alturaCm;


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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(Integer alturaCm) {
        this.alturaCm = alturaCm;
    }

    public Usuario(){

    }


    public Usuario(String id, String nome, String login, Integer alturaCm, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.alturaCm = alturaCm;
        this.idade = idade;
    }

    //toda vez que for persistir uma entidade com esta anotação antes de persistir seta este id para salvar a entidade
    @PrePersist
    public void criaId(){
        this.id = UUID.randomUUID().toString();
    }
}
