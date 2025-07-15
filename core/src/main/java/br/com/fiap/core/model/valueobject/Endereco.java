package br.com.fiap.core.model.valueobject;

import br.com.fiap.core.model.valueobject.enums.Estado;

public class Endereco {

    private final String rua;
    private final String numero;
    private final String complemento;
    private final String cidade;
    private final Estado estado;
    private final String cep;

    public Endereco(String rua, String numero, String complemento, String cidade, Estado estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s - %s, %s, %s", rua, numero, complemento, cidade, estado, cep);
    }
}