package br.com.fiap.core.model;

import br.com.fiap.core.model.valueobject.Endereco;
import br.com.fiap.core.model.valueobject.Funcionamento;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {

    private String nome;
    private Endereco endereco;
    private List<ServicoBeleza> servicos;
    private List<Profissional> profissionais;
    private List<Funcionamento> diasFuncionamento;
    private String fotos;
    private List<Avaliacao> avaliacoes;

    public Estabelecimento(String nome, Endereco endereco, List<ServicoBeleza> servicos, List<Profissional> profissionais, List<Funcionamento> diasFuncionamento, String fotos) {
        this.nome = nome;
        this.endereco = endereco;
        this.servicos = servicos;
        this.profissionais = profissionais;
        this.diasFuncionamento = diasFuncionamento;
        this.fotos = fotos;
        this.avaliacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<ServicoBeleza> getServicos() {
        return servicos;
    }

    public void setServicos(List<ServicoBeleza> servicos) {
        this.servicos = servicos;
    }

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }

    public List<Funcionamento> getDiasFuncionamento() {
        return diasFuncionamento;
    }

    public void setDiasFuncionamento(List<Funcionamento> diasFuncionamento) {
        this.diasFuncionamento = diasFuncionamento;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public boolean isDisponivel(LocalDateTime dataHora, Profissional profissional) {
        return diasFuncionamento.stream()
                .anyMatch(funcionamento -> funcionamento.isAberto(dataHora.toLocalTime(), dataHora.getDayOfWeek()))
                && profissional.isDisponivel(dataHora);
    }
}