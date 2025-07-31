package br.com.fiap.infrastructure.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.EnumSet;

public record FuncionamentoDTO(
        @NotNull @Schema(type = "string", format = "time", example = "08:00") LocalTime horaAbertura,
        @NotNull @Schema(type = "string", format = "time", example = "18:00") LocalTime horaFechamento,
        @NotNull EnumSet<DayOfWeek> diasFuncionamento
) {
}