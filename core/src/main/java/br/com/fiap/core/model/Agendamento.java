package br.com.fiap.core.model;

import br.com.fiap.core.exception.AgendamentoRuntimeException;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import br.com.fiap.core.model.valueobject.enums.StatusAgendamento;

import java.time.LocalDateTime;

public class Agendamento {

    private Estabelecimento estabelecimento;
    private Profissional profissional;
    private ServicoBeleza servico;
    private LocalDateTime dataHora;
    private StatusAgendamento status;

    public Agendamento(Estabelecimento estabelecimento, Profissional profissional, ServicoBeleza servico, LocalDateTime dataHora) {
        if (!profissional.isDisponivel(dataHora)) {
            throw new AgendamentoRuntimeException("O profissional não está disponível no horário solicitado.");
        }
        this.estabelecimento = estabelecimento;
        this.profissional = profissional;
        this.servico = servico;
        this.dataHora = dataHora;
        this.status = StatusAgendamento.PENDENTE;
    }

    public void cancelar() {
        if (status == StatusAgendamento.REALIZADO) {
            throw new AgendamentoRuntimeException("Não é possível cancelar um agendamento já realizado.");
        }
        this.status = StatusAgendamento.CANCELADO;
    }

    public void marcarNaoComparecimento() {
        if (status != StatusAgendamento.CONFIRMADO) {
            throw new AgendamentoRuntimeException("Somente agendamentos confirmados podem ser marcados como não comparecidos.");
        }
        this.status = StatusAgendamento.NAO_COMPARECIDO;
    }

    public void reagendar(LocalDateTime novaDataHora) {
        if (status == StatusAgendamento.REALIZADO) {
            throw new AgendamentoRuntimeException("Não é possível reagendar um agendamento já realizado.");
        }
        if (!profissional.isDisponivel(novaDataHora)) {
            throw new AgendamentoRuntimeException("O profissional não está disponível no novo horário solicitado.");
        }
        this.dataHora = novaDataHora;
        this.status = StatusAgendamento.PENDENTE;
    }

    public void realizarAtendimento() {
        if (status != StatusAgendamento.CONFIRMADO) {
            throw new AgendamentoRuntimeException("Somente agendamentos confirmados podem ser atendidos.");
        }
        this.status = StatusAgendamento.REALIZADO;
    }
}