package br.com.fiap.core.model;

public class Avaliacao {

    private int nota;
    private String comentario;
    private String idCliente;
    private String idProfissional;
    private String idEstabelecimento;

    public Avaliacao(int nota, String comentario, String idCliente, String idProfissional, String idEstabelecimento) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5.");
        }
        this.nota = nota;
        this.comentario = comentario;
        this.idCliente = idCliente;
        this.idProfissional = idProfissional;
        this.idEstabelecimento = idEstabelecimento;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(String idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(String idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }
}