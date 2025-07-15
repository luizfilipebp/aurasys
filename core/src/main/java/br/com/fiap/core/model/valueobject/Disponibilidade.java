package br.com.fiap.core.model.valueobject;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Disponibilidade {

    private final DayOfWeek diaSemana;
    private final LocalTime inicio;
    private final LocalTime fim;

    public Disponibilidade(DayOfWeek diaSemana, LocalTime inicio, LocalTime fim) {
        this.diaSemana = diaSemana;
        this.inicio = inicio;
        this.fim = fim;
    }

    public boolean isDisponivel(DayOfWeek diaAtual, LocalTime horarioAtual) {
        return diaSemana.equals(diaAtual) &&
                !horarioAtual.isBefore(inicio) &&
                !horarioAtual.isAfter(fim);
    }

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public LocalTime getFim() {
        return fim;
    }
}