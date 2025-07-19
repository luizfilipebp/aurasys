package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPeloNomeGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.usecase.BuscarEstabelecimentoPeloNome;

public class BuscarEstabelecimentoPeloNomeImpl implements BuscarEstabelecimentoPeloNome {
    private final BuscarEstabelecimentoPeloNomeGateway buscarEstabelecimentoPeloNomeGateway;

    public BuscarEstabelecimentoPeloNomeImpl(BuscarEstabelecimentoPeloNomeGateway buscarEstabelecimentoPeloNomeGateway) {
        this.buscarEstabelecimentoPeloNomeGateway = buscarEstabelecimentoPeloNomeGateway;
    }

    @Override
    public Page<Estabelecimento> buscar(String nome, int numeroPagina, int tamanhoPagina) {
        return buscarEstabelecimentoPeloNomeGateway.buscar(nome, numeroPagina, tamanhoPagina);
    }
}
