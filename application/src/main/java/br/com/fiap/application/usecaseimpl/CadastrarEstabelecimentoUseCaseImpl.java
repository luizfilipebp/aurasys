package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.CadastrarEstabelecimentoGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.usecase.CadastrarEstabelecimentoUseCase;

public class CadastrarEstabelecimentoUseCaseImpl implements CadastrarEstabelecimentoUseCase {

    private final CadastrarEstabelecimentoGateway cadastrarEstabelecimentoGateway;

    public CadastrarEstabelecimentoUseCaseImpl(CadastrarEstabelecimentoGateway cadastrarEstabelecimentoGateway) {
        this.cadastrarEstabelecimentoGateway = cadastrarEstabelecimentoGateway;
    }

    @Override
    public Estabelecimento cadastrar(Estabelecimento estabelecimento) throws Exception {
        return cadastrarEstabelecimentoGateway.cadastrar(estabelecimento);
    }
}
