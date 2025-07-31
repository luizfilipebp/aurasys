package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Avaliacao;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;

public interface BuscarEstabelecimentoPelaAvaliacaoGateway {
    Page<Estabelecimento> buscar(Avaliacao avaliacao, int numeroPagina, int tamanhoPagina);
}
