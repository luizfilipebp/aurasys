package br.com.fiap.core.model.valueobject;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.EnumSet;

public class Funcionamento {

    private final LocalTime horaAbertura;
    private final LocalTime horaFechamento;
    private final EnumSet<DayOfWeek> diasFuncionamento;

    public Funcionamento(LocalTime horaAbertura, LocalTime horaFechamento, EnumSet<DayOfWeek> diasFuncionamento) {
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.diasFuncionamento = diasFuncionamento;
    }

    public boolean isAberto(LocalTime horarioAtual, DayOfWeek diaAtual) {
        return diasFuncionamento.contains(diaAtual) &&
                !horarioAtual.isBefore(horaAbertura) &&
                !horarioAtual.isAfter(horaFechamento);
    }

    public LocalTime getHoraAbertura() {
        return horaAbertura;
    }

    public LocalTime getHoraFechamento() {
        return horaFechamento;
    }

    public EnumSet<DayOfWeek> getDiasFuncionamento() {
        return diasFuncionamento;
    }
}