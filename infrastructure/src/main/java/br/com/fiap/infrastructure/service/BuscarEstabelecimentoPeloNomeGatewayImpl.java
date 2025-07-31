package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPeloNomeGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuscarEstabelecimentoPeloNomeGatewayImpl implements BuscarEstabelecimentoPeloNomeGateway {
    @Override
    public Page<Estabelecimento> buscar(String nome, int numeroPagina, int tamanhoPagina) {
        return null;
    }
}
