package br.com.fiap.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    private long id;
    private String nome;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<AvaliacaoEntity> avaliacoes;
}
