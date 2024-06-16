package main.java.com.petshop.domain;
public class Pet {
    private String nome;
    private String raca;
    private String tipoAnimal;

    public Pet(String nome, String raca, String tipoAnimal) {
        this.nome = nome;
        this.raca = raca;
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
