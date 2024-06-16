package main.java.com.petshop.domain;

import main.java.com.petshop.enums.UF;

public class Administrador extends Pessoa {

    public Administrador(String nomeCompleto, String telefone, String email, String senha, String cep, UF uf,
            String cidade, String bairro, String rua, String numero) {
        super(nomeCompleto, telefone, email, senha, cep, uf, cidade, bairro, rua, numero);
    }

}
