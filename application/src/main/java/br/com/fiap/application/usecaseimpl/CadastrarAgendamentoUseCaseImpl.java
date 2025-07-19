package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.CadastrarAgendamentoGateway;
import br.com.fiap.core.model.Agendamento;
import br.com.fiap.usecase.CadastrarAgendamentoUseCase;

public class CadastrarAgendamentoUseCaseImpl implements CadastrarAgendamentoUseCase {

    private final CadastrarAgendamentoGateway cadastrarAgendamentoGateway;

    public CadastrarAgendamentoUseCaseImpl(CadastrarAgendamentoGateway cadastrarAgendamentoGateway) {
        this.cadastrarAgendamentoGateway = cadastrarAgendamentoGateway;
    }


    @Override
    public Agendamento cadastrar(Agendamento agendamento) {
        return cadastrarAgendamentoGateway.cadastrar(agendamento);
    }
}
