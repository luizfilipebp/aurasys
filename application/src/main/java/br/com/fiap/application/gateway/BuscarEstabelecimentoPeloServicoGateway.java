package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;

public interface BuscarEstabelecimentoPeloServicoGateway {
    Page<Estabelecimento> buscar(ServicoBeleza servico, int numeroPagina, int tamanhoPagina);
}
