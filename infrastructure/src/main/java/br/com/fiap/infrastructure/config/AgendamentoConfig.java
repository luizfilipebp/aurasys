package br.com.fiap.infrastructure.config;

import br.com.fiap.application.gateway.CadastrarAgendamentoGateway;
import br.com.fiap.application.usecaseimpl.CadastrarAgendamentoUseCaseImpl;
import br.com.fiap.usecase.CadastrarAgendamentoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgendamentoConfig {

    @Bean
    CadastrarAgendamentoUseCase cadastrarAgendamentoUseCase(CadastrarAgendamentoGateway gateway) {
        return new CadastrarAgendamentoUseCaseImpl(gateway);
    }

}
