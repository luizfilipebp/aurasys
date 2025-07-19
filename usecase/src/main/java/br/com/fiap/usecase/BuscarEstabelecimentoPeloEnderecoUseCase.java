package br.com.fiap.usecase;

import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.Endereco;

public interface BuscarEstabelecimentoPeloEnderecoUseCase {

    Page<Estabelecimento> buscar(Endereco endereco, int numeroPagina, int tamanhoPagina);
}
