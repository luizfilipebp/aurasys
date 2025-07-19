package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPelaAvaliacaoGateway;
import br.com.fiap.core.model.Avaliacao;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.usecase.BuscarEstabelecimentoPelaAvaliacaoUseCase;

public class BuscarEstabelecimentoPelaAvaliacaoImpl implements BuscarEstabelecimentoPelaAvaliacaoUseCase {

    private final BuscarEstabelecimentoPelaAvaliacaoGateway gateway;

    public BuscarEstabelecimentoPelaAvaliacaoImpl(BuscarEstabelecimentoPelaAvaliacaoGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Page<Estabelecimento> buscar(Avaliacao avaliacao, int numeroPagina, int tamanhoPagina) {
        return gateway.buscar(avaliacao, numeroPagina, tamanhoPagina);
    }
}
