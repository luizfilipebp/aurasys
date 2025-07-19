package br.com.fiap.usecase;

import br.com.fiap.core.model.Profissional;

public interface CadastrarProfissionalUseCase {

    Profissional cadastrar(Profissional profissional) throws Exception;
}
