package br.com.fiap.core.model;

import br.com.fiap.core.model.valueobject.Endereco;
import br.com.fiap.core.model.valueobject.Funcionamento;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {

    private String nome;
    private Endereco endereco;
    private List<ServicoBeleza> servicos;
    private List<Profissional> profissionais;
    private List<Funcionamento> diasFuncionamento;
    private List<String> fotos; // Alterado para lista de fotos
    private List<Avaliacao> avaliacoes;

    public Estabelecimento(String nome, Endereco endereco, List<ServicoBeleza> servicos, List<Profissional> profissionais, List<Funcionamento> diasFuncionamento, List<String> fotos) {
        this.nome = nome;
        this.endereco = endereco;
        this.servicos = servicos;
        this.profissionais = profissionais;
        this.diasFuncionamento = diasFuncionamento;
        this.fotos = new ArrayList<>();
        if (fotos != null) {
            fotos.forEach(this::adicionarFoto); // Valida e adiciona fotos
        }
        this.avaliacoes = new ArrayList<>();
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void adicionarFoto(String foto) {
        if (isFotoValida(foto)) {
            fotos.add(foto);
        } else {
            throw new IllegalArgumentException("URL de foto inválida: " + foto);
        }
    }

    public void removerFoto(String foto) {
        fotos.remove(foto);
    }

    private boolean isFotoValida(String foto) {
        try {
            new URL(foto); // Verifica se é uma URL válida
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }

    public boolean isDisponivel(LocalDateTime dataHora, Profissional profissional) {
        return diasFuncionamento.stream()
                .anyMatch(funcionamento -> funcionamento.isAberto(dataHora.toLocalTime(), dataHora.getDayOfWeek()))
                && profissional.isDisponivel(dataHora);
    }
}