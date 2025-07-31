package br.com.fiap.core.model;

import br.com.fiap.core.exception.AgendamentoRuntimeException;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import br.com.fiap.core.model.valueobject.enums.StatusAgendamento;

import java.time.LocalDateTime;
import java.util.Objects;

public class Agendamento {

    private String idEstabelecimento;
    private String idProfissional;
    private ServicoBeleza servico;
    private LocalDateTime dataHora;
    private StatusAgendamento status;

    public Agendamento(String idEstabelecimento, String profissional, ServicoBeleza servico, LocalDateTime dataHora) {
//        if (!profissional.isDisponivel(dataHora)) {
//            throw new AgendamentoRuntimeException("O profissional não está disponível no horário solicitado.");
//        }
        this.idEstabelecimento = idEstabelecimento;
        this.idProfissional = profissional;
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
//        if (!idProfissional.isDisponivel(novaDataHora)) {
//            throw new AgendamentoRuntimeException("O profissional não está disponível no novo horário solicitado.");
//        }
        this.dataHora = novaDataHora;
        this.status = StatusAgendamento.PENDENTE;
    }

    public void realizarAtendimento() {
        if (status != StatusAgendamento.CONFIRMADO) {
            throw new AgendamentoRuntimeException("Somente agendamentos confirmados podem ser atendidos.");
        }
        this.status = StatusAgendamento.REALIZADO;
    }

    public StatusAgendamento getStatus() {
        return this.status;
    }

    public ServicoBeleza getServico() {
        return servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }


    public String getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(String idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(String idProfissional) {
        this.idProfissional = idProfissional;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento that = (Agendamento) o;
        return Objects.equals(idProfissional, that.idProfissional) && Objects.equals(dataHora, that.dataHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProfissional, dataHora);
    }
}