package br.com.fiap.application.usecaseimpl;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPeloServicoGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import br.com.fiap.usecase.BuscarEstabelecimentoPeloServicoUseCase;

public class BuscarEstabelecimentoPeloServicoImpl implements BuscarEstabelecimentoPeloServicoUseCase {

    private final BuscarEstabelecimentoPeloServicoGateway gateway;

    public BuscarEstabelecimentoPeloServicoImpl(BuscarEstabelecimentoPeloServicoGateway gateway) {
        this.gateway = gateway;
    }


    @Override
    public Page<Estabelecimento> buscar(ServicoBeleza servico, int numeroPagina, int tamanhoPagina) {
        return gateway.buscar(servico, numeroPagina, tamanhoPagina);
    }
}
