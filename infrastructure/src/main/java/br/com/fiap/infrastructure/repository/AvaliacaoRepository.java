package br.com.fiap.infrastructure.repository;

import br.com.fiap.infrastructure.entity.AvaliacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, Long> {
    List<AvaliacaoEntity> findByProfissionalId(Long profissionalId);
    List<AvaliacaoEntity> findByEstabelecimentoId(Long estabelecimentoId);
}