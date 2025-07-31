package br.com.fiap.infrastructure.dto;

import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record EstabelecimentoDTO(
        @NotNull @NotEmpty String nome,
        @NotNull EnderecoDTO endereco,
        @NotNull @NotEmpty List<ServicoBeleza> servicos,
        List<FuncionamentoDTO> diasFuncionamento,
        @Schema(example = "[\"https://exemplo.com/imagem1.jpg\", \"https://exemplo.com/imagem2.jpg\"]") List<String> fotos
) {
}