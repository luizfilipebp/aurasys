package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPeloEnderecoGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.Endereco;
import br.com.fiap.usecase.BuscarEstabelecimentoPeloEnderecoUseCase;

public class BuscarEstabelecimentoPeloEnderecoImpl implements BuscarEstabelecimentoPeloEnderecoUseCase {

    private final BuscarEstabelecimentoPeloEnderecoGateway gateway;

    public BuscarEstabelecimentoPeloEnderecoImpl(BuscarEstabelecimentoPeloEnderecoGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Page<Estabelecimento> buscar(Endereco endereco, int numeroPagina, int tamanhoPagina) {
        return gateway.buscar(endereco, numeroPagina, tamanhoPagina);
    }
}
