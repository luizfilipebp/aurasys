package br.com.fiap.infrastructure.repository;

import br.com.fiap.infrastructure.entity.EstabelecimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<EstabelecimentoEntity, Long> {
}
