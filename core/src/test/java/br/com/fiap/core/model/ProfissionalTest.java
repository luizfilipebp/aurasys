package br.com.fiap.core.model;

import br.com.fiap.core.model.valueobject.Disponibilidade;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProfissionalTest {

    private Profissional profissional;

    @BeforeEach
    void setUp() {
        List<ServicoBeleza> especialidades = List.of(ServicoBeleza.CORTE_CABELO, ServicoBeleza.MANICURE);
        List<Disponibilidade> disponibilidade = List.of(
                new Disponibilidade(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)),
                new Disponibilidade(DayOfWeek.TUESDAY, LocalTime.of(9, 0), LocalTime.of(18, 0))
        );
        Map<ServicoBeleza, Double> tarifasPorServico = new HashMap<>();
        tarifasPorServico.put(ServicoBeleza.CORTE_CABELO, 50.0);
        tarifasPorServico.put(ServicoBeleza.MANICURE, 30.0);

        profissional = new Profissional(especialidades, disponibilidade, tarifasPorServico);
    }

    @Test
    void testCriarProfissionalComSucesso() {
        assertEquals(2, profissional.getEspecialidades().size());
        assertEquals(2, profissional.getDisponibilidade().size());
        assertEquals(50.0, profissional.getTarifaPorServico(ServicoBeleza.CORTE_CABELO));
        assertEquals(30.0, profissional.getTarifaPorServico(ServicoBeleza.MANICURE));
    }

    @Test
    void testAtualizarEspecialidadesComSucesso() {
        List<ServicoBeleza> novasEspecialidades = List.of(ServicoBeleza.PEDICURE);
        profissional.setEspecialidades(novasEspecialidades);
        assertEquals(1, profissional.getEspecialidades().size());
        assertTrue(profissional.getEspecialidades().contains(ServicoBeleza.PEDICURE));
    }

    @Test
    void testAtualizarTarifaPorServicoComSucesso() {
        profissional.setTarifaPorServico(ServicoBeleza.CORTE_CABELO, 60.0);
        assertEquals(60.0, profissional.getTarifaPorServico(ServicoBeleza.CORTE_CABELO));
    }

    @Test
    void testAdicionarAvaliacaoComSucesso() {
        Avaliacao avaliacao = new Avaliacao(5, "Ótimo serviço", null);
        profissional.adicionarAvaliacao(avaliacao);
        assertEquals(1, profissional.getAvaliacoes().size());
        assertEquals(avaliacao, profissional.getAvaliacoes().get(0));
    }

    @Test
    void testDisponibilidadeProfissional() {
        LocalDateTime horarioDisponivel = LocalDateTime.of(2023, 10, 9, 10, 0); // Segunda-feira
        LocalDateTime horarioIndisponivel = LocalDateTime.of(2023, 10, 9, 20, 0); // Segunda-feira fora do horário

        assertTrue(profissional.isDisponivel(horarioDisponivel));
        assertFalse(profissional.isDisponivel(horarioIndisponivel));
    }
}