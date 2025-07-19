package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.CadastrarAvaliacaoGateway;
import br.com.fiap.core.model.Avaliacao;
import br.com.fiap.usecase.CadastrarAvaliacaoUseCase;

public class CadastrarAvaliacaoUseCaseImpl implements CadastrarAvaliacaoUseCase {

    private final CadastrarAvaliacaoGateway cadastrarAvaliacaoGateway;

    public CadastrarAvaliacaoUseCaseImpl(CadastrarAvaliacaoGateway cadastrarAvaliacaoGateway) {
        this.cadastrarAvaliacaoGateway = cadastrarAvaliacaoGateway;
    }


    @Override
    public Avaliacao cadastrar(Avaliacao avaliacao) {
        return cadastrarAvaliacaoGateway.cadastrar(avaliacao);
    }
}
