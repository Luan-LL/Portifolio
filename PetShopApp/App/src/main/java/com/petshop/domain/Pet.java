package main.java.com.petshop.domain;

import main.java.com.petshop.enums.Porte;

public class Pet {
    private String nome;
    private Porte porte;
    private String raca;
    private String tipoAnimal;

    public Pet(String nome, Porte porte, String raca, String tipoAnimal) {
        this.nome = nome;
        this.porte = porte;
        this.raca = raca;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

}
