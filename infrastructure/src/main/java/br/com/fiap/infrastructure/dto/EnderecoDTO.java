package br.com.fiap.infrastructure.dto;

import br.com.fiap.core.model.valueobject.enums.Estado;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record EnderecoDTO(
        @NotNull @NotEmpty @Size(max = 100) String rua,
        @NotNull @NotEmpty @Size(max = 10) String numero,
        @Size(max = 50) String complemento,
        @NotNull @NotEmpty @Size(max = 50) String cidade,
        @NotNull @Schema(example = "AC") Estado estado,
        @NotNull @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP deve estar no formato 00000-000") String cep
) {
}