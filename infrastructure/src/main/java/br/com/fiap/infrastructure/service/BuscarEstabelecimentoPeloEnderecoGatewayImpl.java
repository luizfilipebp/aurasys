package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.BuscarEstabelecimentoPeloEnderecoGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.Endereco;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuscarEstabelecimentoPeloEnderecoGatewayImpl implements BuscarEstabelecimentoPeloEnderecoGateway {
    @Override
    public Page<Estabelecimento> buscar(Endereco endereco, int numeroPagina, int tamanhoPagina) {
        return null;
    }
}
