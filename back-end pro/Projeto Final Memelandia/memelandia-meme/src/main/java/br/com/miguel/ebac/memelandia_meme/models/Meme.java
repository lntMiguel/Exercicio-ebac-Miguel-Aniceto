package br.com.miguel.ebac.memelandia_meme.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Meme")
public class Meme {

    @Id
    private String id;
    private String idUsuario;
    private String idCategoria;
    private String nome;
    private String descricao;
    private String url;
    private Date dataDeCriacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Meme(String id, String idUsuario, String idCategoria, String nome, String descricao, String url) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeCriacao = new Date();
        this.url = url;
    }


}
