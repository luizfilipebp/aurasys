package br.com.fiap.infrastructure.repository;

import br.com.fiap.infrastructure.entity.AgendamentoEntity;
import br.com.fiap.infrastructure.entity.ProfissionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long> {
    List<AgendamentoEntity> findByDataHoraBetween(LocalDateTime inicio, LocalDateTime fim);
    AgendamentoEntity findByDataHoraAndProfissional(LocalDateTime dataHora, ProfissionalEntity profissional);
}