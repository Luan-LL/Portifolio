package main.java.com.petshop.domain;
import java.time.LocalDateTime;

public class Agendamento {
    private LocalDateTime dataHora;
    private String status;
    private Pet pet;
    private Servico servico;
    private Usuario dono;
    private Profissional profissional;

    public Agendamento(Servico servico,Profissional profissional, LocalDateTime dataHora, String status, Pet pet, Usuario dono) {
        this.servico = servico;
        this.profissional = profissional;
        this.dataHora = dataHora;
        this.status = status;
        this.pet = pet;
        this.dono = dono;
    }

    // Getters and Setters


    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }
}
