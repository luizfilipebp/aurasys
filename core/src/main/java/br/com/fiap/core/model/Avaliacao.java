package br.com.fiap.core.model;

public class Avaliacao {

    private int nota;
    private String comentario;
    private Cliente cliente;
    private Profissional profissional;
    private Estabelecimento estabelecimento;

    public Avaliacao(int nota, String comentario, Cliente cliente, Profissional profissional, Estabelecimento estabelecimento) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5.");
        }
        this.nota = nota;
        this.comentario = comentario;
        this.cliente = cliente;
        this.profissional = profissional;
        this.estabelecimento = estabelecimento;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }
}