package main.java.com.petshop;

import java.time.LocalDateTime;

import main.java.com.petshop.domain.Agendamento;
import main.java.com.petshop.domain.Pet;
import main.java.com.petshop.domain.Servico;
import main.java.com.petshop.domain.Profissional;
import main.java.com.petshop.domain.Usuario;
import main.java.com.petshop.enums.*;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Filisbino Silveira", "11999999999", "filisbino.silveira@example.com", "senha123", 
        "12345678", UF.SP, "São Paulo", "Centro", "Rua Exemplo", "123");
        Pet pet = new Pet("Rex", Porte.Grande,"Labrador", "Cachorro");

        Profissional profissional = new Profissional("Matheus Souza Filho", "17997999999", "mathues.filho@example.com", "senha321", 
        "1252587", UF.SP, "São Paulo", "Centro", "Rua Exemplo2", "323", "Curriculo.PDF","Veterinario");

        Servico servico = new Servico("Veterinário"); 


        LocalDateTime dataHoraAgendamento = LocalDateTime.of(2024, 6, 6, 14, 30);

        Agendamento agendamento = new Agendamento(servico,profissional, dataHoraAgendamento, "Pendente", pet, usuario);

        System.out.println("Detalhes do Usuario:");
        System.out.println("Nome Completo: " + usuario.getNomeCompleto());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("CEP: " + usuario.getCep());
        System.out.println("UF: " + usuario.getUf());
        System.out.println("Cidade: " + usuario.getCidade());
        System.out.println("Bairro: " + usuario.getBairro());
        System.out.println("Rua: " + usuario.getRua());
        System.out.println("Numero: " + usuario.getNumero());

        System.out.println("\nDetalhes do Pet:");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Raça: " + pet.getRaca());
        System.out.println("Porte: "+pet.getPorte());
        System.out.println("Tipo de Animal: " + pet.getTipoAnimal());

        System.out.println("\nDetalhes do Profissional:");
        System.out.println("Nome Completo: " + profissional.getNomeCompleto());
        System.out.println("Cargo: " + profissional.getCargo());
        System.out.println("Curriculo: " + profissional.getCurriculo());
        System.out.println("Telefone: " + profissional.getTelefone());
        System.out.println("Email: " + profissional.getEmail());
        System.out.println("CEP: " + profissional.getCep());
        System.out.println("UF: " + profissional.getUf());
        System.out.println("Cidade: " + profissional.getCidade());
        System.out.println("Bairro: " + profissional.getBairro());
        System.out.println("Rua: " + profissional.getRua());
        System.out.println("Numero: " + profissional.getNumero());

        System.out.println("\nDetalhes do Agendamento:");
        System.out.println("Tipos de Serviço: " + agendamento.getServico().getServico());
        System.out.println("Profissional: "+agendamento.getProfissional().getNomeCompleto());
        System.out.println("Data e Hora: " + agendamento.getDataHora().toString());
        System.out.println("Status: " + agendamento.getStatus());
        System.out.println("Pet: " + agendamento.getPet().getNome());
        System.out.println("Dono: " + agendamento.getDono().getNomeCompleto());
    }
}
