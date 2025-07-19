package br.com.fiap.usecase;

import br.com.fiap.core.model.Avaliacao;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;

public interface BuscarEstabelecimentoPelaAvaliacao {
    Page<Estabelecimento> buscar(Avaliacao avaliacao, int numeroPagina, int tamanhoPagina);
}
