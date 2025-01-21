package br.com.miguel.ebac.animal_service.entidades;


import jakarta.persistence.*;

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
