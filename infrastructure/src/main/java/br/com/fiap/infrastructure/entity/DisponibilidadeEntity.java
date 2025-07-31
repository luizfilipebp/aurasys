package br.com.fiap.infrastructure.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class DisponibilidadeEntity {
    private String diaSemana;
    private String horarioInicio;
    private String horarioFim;
}