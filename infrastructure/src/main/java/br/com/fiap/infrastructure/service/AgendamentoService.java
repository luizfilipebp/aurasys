package br.com.fiap.infrastructure.service;

import br.com.fiap.core.model.valueobject.enums.StatusAgendamento;
import br.com.fiap.infrastructure.entity.AgendamentoEntity;
import br.com.fiap.infrastructure.repository.AgendamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public List<AgendamentoEntity> listarTodos() {
        return agendamentoRepository.findAll();
    }

    public AgendamentoEntity cancelar(Long id) {
        AgendamentoEntity agendamento = buscarAgendamento(id);
        agendamento.setStatus(StatusAgendamento.CANCELADO);
        return agendamentoRepository.save(agendamento);
    }

    public AgendamentoEntity reagendar(Long id, LocalDateTime novaDataHora) {
        AgendamentoEntity agendamento = buscarAgendamento(id);
        agendamento.setDataHora(novaDataHora);
        agendamento.setStatus(StatusAgendamento.REAGENDADO);
        return agendamentoRepository.save(agendamento);
    }

    public AgendamentoEntity marcarNaoComparecimento(Long id) {
        AgendamentoEntity agendamento = buscarAgendamento(id);
        agendamento.setStatus(StatusAgendamento.NAO_COMPARECIDO);
        return agendamentoRepository.save(agendamento);
    }

    private AgendamentoEntity buscarAgendamento(Long id) {
        return agendamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));
    }
}