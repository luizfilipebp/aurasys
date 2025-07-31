package br.com.fiap.infrastructure.service.gateways;

import br.com.fiap.application.gateway.CadastrarEstabelecimentoGateway;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.infrastructure.mapper.EstabelecimentoMapper;
import br.com.fiap.infrastructure.repository.EstabelecimentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CadastrarEstabelecimentoGatewayImpl implements CadastrarEstabelecimentoGateway {

    private final EstabelecimentoRepository repository;

    @Override
    public Estabelecimento cadastrar(Estabelecimento estabelecimento) {
        repository.save(EstabelecimentoMapper.INSTANCE.toEntity(estabelecimento));
        return estabelecimento;
    }
}
