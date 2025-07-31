package br.com.fiap.infrastructure.entity;

import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import br.com.fiap.core.model.valueobject.enums.StatusAgendamento;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Table
@Data
@Entity
public class AgendamentoEntity {

    @Id
    private long id;

    @OneToOne
    private EstabelecimentoEntity estabelecimento;

    @OneToOne
    private ProfissionalEntity profissional;

    @Enumerated(EnumType.STRING)
    private ServicoBeleza servico;

    private LocalDateTime dataHora;


    @Enumerated(EnumType.STRING)
    private StatusAgendamento status;
}
