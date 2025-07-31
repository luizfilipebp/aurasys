package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.CadastrarAgendamentoGateway;
import br.com.fiap.core.model.Agendamento;
import br.com.fiap.infrastructure.entity.AgendamentoEntity;
import br.com.fiap.infrastructure.repository.AgendamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastrarAgendamentoGatewayImpl implements CadastrarAgendamentoGateway {

    private final AgendamentoRepository agendamentoRepository;

    @Override
    public Agendamento cadastrar(Agendamento agendamento) {
        // Verifica se o agendamento já existe
//        agendamentoRepository.findByDataHoraAndProfissional_Id(
//                agendamento.getDataHora(), agendamento.getIdProfissional()
//        ).ifPresent(existingAgendamento -> {
//            throw new IllegalArgumentException("Já existe um agendamento para o profissional nesse horário.");
//        });

        AgendamentoEntity agendamentoEntity = new AgendamentoEntity();
        agendamentoEntity.setDataHora(agendamento.getDataHora());
        agendamentoEntity.setStatus(agendamento.getStatus());
        agendamentoEntity.setServico(agendamento.getServico());
        // Aqui você deve mapear corretamente o estabelecimento e o profissional



        // Salva o agendamento
        agendamentoRepository.save(agendamentoEntity);

        return agendamento;
    }
}