package main.java.com.petshop.domain;

import main.java.com.petshop.enums.Porte;
import main.java.com.petshop.enums.TipoAnimal;

public class Pet {
    private String nome;
    private Porte porte;
    private String raca;
    private String dataNascimento;
    private TipoAnimal tipoAnimal;

    public Pet(String nome, Porte porte, String raca, String dataNascimento, TipoAnimal tipoAnimal) {
        this.nome = nome;
        this.porte = porte;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

}