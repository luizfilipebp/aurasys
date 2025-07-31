package br.com.fiap.infrastructure.config;

import br.com.fiap.application.gateway.CadastrarAvaliacaoGateway;
import br.com.fiap.application.usecaseimpl.CadastrarAvaliacaoUseCaseImpl;
import br.com.fiap.usecase.CadastrarAvaliacaoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoConfig {

    @Bean
    CadastrarAvaliacaoUseCase cadastrarAvaliacaoUseCase(CadastrarAvaliacaoGateway gateway) {
        return new CadastrarAvaliacaoUseCaseImpl(gateway);
    }

}
