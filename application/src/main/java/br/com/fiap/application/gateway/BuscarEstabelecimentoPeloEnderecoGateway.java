package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.Endereco;

public interface BuscarEstabelecimentoPeloEnderecoGateway {
    Page<Estabelecimento> buscar(Endereco endereco, int numeroPagina, int tamanhoPagina);
}
