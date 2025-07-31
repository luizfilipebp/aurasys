package br.com.fiap.infrastructure.entity;

import br.com.fiap.core.model.valueobject.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "endereco")
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class EnderecoEntity {

    @Id
    private Long id;
    private final String rua;
    private final String numero;
    private final String complemento;
    private final String cidade;
    private final Estado estado;
    private final String cep;
}
