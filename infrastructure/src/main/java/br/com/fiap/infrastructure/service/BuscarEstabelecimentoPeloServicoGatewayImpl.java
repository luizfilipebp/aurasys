package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPeloServicoGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class BuscarEstabelecimentoPeloServicoGatewayImpl implements BuscarEstabelecimentoPeloServicoGateway {
    @Override
    public Page<Estabelecimento> buscar(ServicoBeleza servico, int numeroPagina, int tamanhoPagina) {
        return null;
    }
}
