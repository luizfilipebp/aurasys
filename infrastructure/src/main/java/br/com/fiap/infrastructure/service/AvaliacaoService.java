package br.com.fiap.infrastructure.service;

import br.com.fiap.infrastructure.entity.AvaliacaoEntity;
import br.com.fiap.infrastructure.repository.AvaliacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AvaliacaoService {

    private final AvaliacaoRepository avaliacaoRepository;

    public AvaliacaoEntity salvarAvaliacao(AvaliacaoEntity avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public List<AvaliacaoEntity> listarPorProfissional(Long profissionalId) {
        return avaliacaoRepository.findByProfissionalId(profissionalId);
    }

    public List<AvaliacaoEntity> listarPorEstabelecimento(Long estabelecimentoId) {
        return avaliacaoRepository.findByEstabelecimentoId(estabelecimentoId);
    }
}