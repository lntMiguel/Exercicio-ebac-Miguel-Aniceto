package br.com.miguel.ebac.memelandia_categorias.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "categorias")
public class Categoria {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private Date dataDeCriacao;
    private String idUsuario;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public Categoria(String nome, String descricao, String idUsuario) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeCriacao = new Date();
        this.idUsuario = idUsuario;
    }
}
