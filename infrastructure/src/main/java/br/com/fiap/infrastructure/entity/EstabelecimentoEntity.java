package br.com.fiap.infrastructure.entity;

import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

    @Entity
    @Table(name = "estabelecimento")
    @Data
    public class EstabelecimentoEntity {
        @Id
        private long id;
        private String nome;

        @ManyToOne
        @JoinColumn(name = "endereco_id")
        private EnderecoEntity endereco;
        private List<ServicoBeleza> servicos;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "estabelecimento_id")
        private List<ProfissionalEntity> profissionais;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "estabelecimento_id")
        private List<FuncionamentoEntity> diasFuncionamento;

        private List<String> fotos; // Alterado para lista de fotos

        @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
        private List<AvaliacaoEntity> avaliacoes;
    }