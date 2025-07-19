package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;

public interface BuscarEstabelecimentoPeloNomeGateway {
    Page<Estabelecimento> buscar(String nome, int numeroPagina, int tamanhoPagina);
}
