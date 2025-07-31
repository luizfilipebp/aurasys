package br.com.fiap.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ProfissionalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "perfil_id")
    private PerfilProfissionalEntity perfil;
}