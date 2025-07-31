package br.com.fiap.infrastructure.service;

import br.com.fiap.application.gateway.CadastrarAvaliacaoGateway;
import br.com.fiap.core.model.Avaliacao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastrarAvaliacaoGatewayImpl implements CadastrarAvaliacaoGateway {
    @Override
    public Avaliacao cadastrar(Avaliacao avaliacao) {
        return null;
    }
}
