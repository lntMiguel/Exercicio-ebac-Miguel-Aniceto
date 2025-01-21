package br.com.miguel.ebac.funcionario_service.entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Dog extends Animal{

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private String porte;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


}
