package main.java.com.petshop.domain;

import main.java.com.petshop.enums.UF;

public class Profissional extends Pessoa {
    private String curriculo;
    private String cargo;
    public Profissional getNomeCompleto;

    public Profissional(String nomeCompleto, String telefone, String email, String senha, String cep, UF uf,
            String cidade, String bairro, String rua, String numero, String curriculo, String cargo) {
        super(nomeCompleto, telefone, email, senha, cep, uf, cidade, bairro, rua, numero);

        this.curriculo = curriculo;
        this.cargo = cargo;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
