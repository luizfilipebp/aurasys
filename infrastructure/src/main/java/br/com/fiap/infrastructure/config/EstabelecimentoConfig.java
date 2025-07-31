package br.com.fiap.infrastructure.config;

import br.com.fiap.application.gateway.*;
import br.com.fiap.application.usecaseimpl.*;
import br.com.fiap.usecase.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EstabelecimentoConfig {

    @Bean
    BuscarEstabelecimentoPelaAvaliacaoUseCase buscarEstabelecimentoPelaAvaliacaoUseCase(BuscarEstabelecimentoPelaAvaliacaoGateway gateway) {
        return new BuscarEstabelecimentoPelaAvaliacaoImpl(gateway);
    }

    @Bean
    BuscarEstabelecimentoPeloEnderecoUseCase buscarEstabelecimentoPeloEnderecoUseCase(BuscarEstabelecimentoPeloEnderecoGateway gateway) {
        return new BuscarEstabelecimentoPeloEnderecoImpl(gateway);

    }

    @Bean
    BuscarEstabelecimentoPeloNomeUseCase buscarEstabelecimentoPeloNomeUseCase(BuscarEstabelecimentoPeloNomeGateway gateway) {
        return new BuscarEstabelecimentoPeloNomeImpl(gateway);
    }

    @Bean
    BuscarEstabelecimentoPeloServicoUseCase buscarEstabelecimentoPeloServicoUseCase(BuscarEstabelecimentoPeloServicoGateway gateway) {
        return new BuscarEstabelecimentoPeloServicoImpl(gateway);
    }

    @Bean
    CadastrarEstabelecimentoUseCase cadastrarEstabelecimentoUseCase(CadastrarEstabelecimentoGateway gateway) {
        return new CadastrarEstabelecimentoUseCaseImpl(gateway);
    }

}
