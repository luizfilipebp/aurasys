package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPelaAvaliacaoGateway;
import br.com.fiap.core.model.Avaliacao;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuscarEstabelecimentoPelaAvaliacaoGatewayImpl implements BuscarEstabelecimentoPelaAvaliacaoGateway {
    @Override
    public Page<Estabelecimento> buscar(Avaliacao avaliacao, int numeroPagina, int tamanhoPagina) {
        return null;
    }
}
