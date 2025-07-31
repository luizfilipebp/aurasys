package br.com.fiap.infrastructure.entity;

import br.com.fiap.core.model.valueobject.Disponibilidade;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class PerfilProfissionalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "especialidades", joinColumns = @JoinColumn(name = "perfil_id"))
    @Enumerated(EnumType.STRING)
    private List<ServicoBeleza> especialidades;

    @ElementCollection
    @CollectionTable(name = "disponibilidades", joinColumns = @JoinColumn(name = "perfil_id"))
    private List<DisponibilidadeEntity> horariosDisponiveis;

    private BigDecimal tarifa;
}