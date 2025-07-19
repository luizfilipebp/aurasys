package br.com.fiap.application.gateway;

import br.com.fiap.core.model.Profissional;

public interface CadastrarProfissionalGateway {

    Profissional cadastrar(Profissional profissional) throws Exception;
}

