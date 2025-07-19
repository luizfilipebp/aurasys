package br.com.fiap.usecase;

import br.com.fiap.core.model.Estabelecimento;

public interface CadastrarEstabelecimentoUseCase {
    Estabelecimento cadastrar(Estabelecimento estabelecimento) throws Exception;
}
