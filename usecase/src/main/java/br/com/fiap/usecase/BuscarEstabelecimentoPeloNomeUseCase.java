package br.com.fiap.usecase;

import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;

public interface BuscarEstabelecimentoPeloNomeUseCase {
    Page<Estabelecimento> buscar(String nome, int numeroPagina, int tamanhoPagina);
}
