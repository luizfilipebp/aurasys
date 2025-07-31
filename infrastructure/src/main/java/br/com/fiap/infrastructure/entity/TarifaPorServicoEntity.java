package br.com.fiap.infrastructure.entity;

import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tarifa_por_servico")
@Data
public class TarifaPorServicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ServicoBeleza servico;

    private Double valor;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private ProfissionalEntity profissional;
}