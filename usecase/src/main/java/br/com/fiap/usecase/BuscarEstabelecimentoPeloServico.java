package br.com.fiap.usecase;

import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;

public interface BuscarEstabelecimentoPeloServico {
    Page<Estabelecimento> buscar(ServicoBeleza servico, int numeroPagina, int tamanhoPagina);
}
