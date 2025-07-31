package br.com.fiap.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "funcionamento")
public class FuncionamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String diaSemana;
    private String horarioAbertura;
    private String horarioFechamento;
}