package br.com.fiap.core.model;

import br.com.fiap.core.model.valueobject.Disponibilidade;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Profissional {

    private List<ServicoBeleza> especialidades;
    private List<Disponibilidade> disponibilidade;
    private List<Avaliacao> avaliacoes;
    private Map<ServicoBeleza, Double> tarifasPorServico;

    public Profissional(List<ServicoBeleza> especialidades, List<Disponibilidade> disponibilidade, Map<ServicoBeleza, Double> tarifasPorServico) {
        this.especialidades = especialidades;
        this.disponibilidade = disponibilidade;
        this.tarifasPorServico = tarifasPorServico;
        this.avaliacoes = new ArrayList<>();
    }

    public boolean isDisponivel(LocalDateTime dataHora) {
        return disponibilidade.stream()
                .anyMatch(d -> d.isDisponivel(dataHora.getDayOfWeek(), dataHora.toLocalTime()));
    }

    public List<ServicoBeleza> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<ServicoBeleza> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Disponibilidade> getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(List<Disponibilidade> disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Double getTarifaPorServico(ServicoBeleza servico) {
        return tarifasPorServico.get(servico);
    }

    public void setTarifaPorServico(ServicoBeleza servico, Double tarifa) {
        tarifasPorServico.put(servico, tarifa);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}