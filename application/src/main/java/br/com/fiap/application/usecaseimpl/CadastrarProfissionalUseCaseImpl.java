package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.CadastrarProfissionalGateway;
import br.com.fiap.core.model.Profissional;
import br.com.fiap.usecase.CadastrarProfissionalUseCase;

public class CadastrarProfissionalUseCaseImpl implements CadastrarProfissionalUseCase {

    private final CadastrarProfissionalGateway cadastrarProfissionalGateway;

    public CadastrarProfissionalUseCaseImpl(CadastrarProfissionalGateway cadastrarProfissionalGateway) {
        this.cadastrarProfissionalGateway = cadastrarProfissionalGateway;
    }

    @Override
    public Profissional cadastrar(Profissional profissional) throws Exception {
        return cadastrarProfissionalGateway.cadastrar(profissional);
    }
}
