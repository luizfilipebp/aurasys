package br.com.fiap.core.model;

import br.com.fiap.core.exception.AgendamentoRuntimeException;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import br.com.fiap.core.model.valueobject.enums.StatusAgendamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AgendamentoTest {

    private string estabelecimento;
    private Profissional profissional;
    private ServicoBeleza servico;
    private LocalDateTime dataHora;

    @BeforeEach
    void setUp() {
        estabelecimento = mock(string.class);
        profissional = mock(Profissional.class);
        servico = ServicoBeleza.CORTE_CABELO;
        dataHora = LocalDateTime.now().plusDays(1);

        when(profissional.isDisponivel(dataHora)).thenReturn(true);
    }

    @Test
    void testCriarAgendamentoComSucesso() {
        Agendamento agendamento = new Agendamento(estabelecimento, profissional, servico, dataHora);

        assertEquals(StatusAgendamento.PENDENTE, agendamento.getStatus());
        assertEquals(dataHora, agendamento.getDataHora());
    }

    @Test
    void testCriarAgendamentoComProfissionalIndisponivel() {
        when(profissional.isDisponivel(dataHora)).thenReturn(false);

        assertThrows(AgendamentoRuntimeException.class, () ->
            new Agendamento(estabelecimento, profissional, servico, dataHora)
        );
    }

    @Test
    void testCancelarAgendamentoComSucesso() {
        Agendamento agendamento = new Agendamento(estabelecimento, profissional, servico, dataHora);
        agendamento.cancelar();

        assertEquals(StatusAgendamento.CANCELADO, agendamento.getStatus());
    }

    @Test
    void testCancelarAgendamentoJaRealizado() {
        Agendamento agendamento = new Agendamento(estabelecimento, profissional, servico, dataHora);
        agendamento.realizarAtendimento();

        assertThrows(AgendamentoRuntimeException.class, agendamento::cancelar);
    }

    @Test
    void testReagendarComSucesso() {
        LocalDateTime novaDataHora = dataHora.plusDays(2);
        when(profissional.isDisponivel(novaDataHora)).thenReturn(true);

        Agendamento agendamento = new Agendamento(estabelecimento, profissional, servico, dataHora);
        agendamento.reagendar(novaDataHora);

        assertEquals(StatusAgendamento.PENDENTE, agendamento.getStatus());
        assertEquals(novaDataHora, agendamento.getDataHora());
    }

    @Test
    void testReagendarComProfissionalIndisponivel() {
        LocalDateTime novaDataHora = dataHora.plusDays(2);
        when(profissional.isDisponivel(novaDataHora)).thenReturn(false);

        Agendamento agendamento = new Agendamento(estabelecimento, profissional, servico, dataHora);

        assertThrows(AgendamentoRuntimeException.class, () -> agendamento.reagendar(novaDataHora));
    }

    @Test
    void testRealizarAtendimentoComSucesso() {
        Agendamento agendamento = new Agendamento(estabelecimento, profissional, servico, dataHora);
        agendamento.setStatus(StatusAgendamento.CONFIRMADO);

        agendamento.realizarAtendimento();

        assertEquals(StatusAgendamento.REALIZADO, agendamento.getStatus());
    }

    @Test
    void testMarcarNaoComparecimentoComStatusInvalido() {
        Agendamento agendamento = new Agendamento(estabelecimento, profissional, servico, dataHora);

        assertThrows(AgendamentoRuntimeException.class, agendamento::marcarNaoComparecimento);
    }
}