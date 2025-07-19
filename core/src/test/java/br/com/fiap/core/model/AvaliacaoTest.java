package br.com.fiap.core.model;

import br.com.fiap.core.exception.AvaliacaoRuntimeException;
import br.com.fiap.core.model.valueobject.enums.TipoAvaliacao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoTest {

    private Avaliacao avaliacao;

    @BeforeEach
    void setUp() {
        avaliacao = new Avaliacao("Ótimo atendimento", 5, TipoAvaliacao.SERVICO);
    }

    @Test
    void testCriarAvaliacaoComSucesso() {
        assertEquals("Ótimo atendimento", avaliacao.getComentario());
        assertEquals(5, avaliacao.getNota());
        assertEquals(TipoAvaliacao.SERVICO, avaliacao.getTipo());
    }

    @Test
    void testCriarAvaliacaoComNotaInvalida() {
        assertThrows(AvaliacaoRuntimeException.class, () -> new Avaliacao("Ruim", -1, TipoAvaliacao.SERVICO));
        assertThrows(AvaliacaoRuntimeException.class, () -> new Avaliacao("Excelente", 6, TipoAvaliacao.SERVICO));
    }

    @Test
    void testAtualizarComentarioComSucesso() {
        avaliacao.setComentario("Atendimento razoável");
        assertEquals("Atendimento razoável", avaliacao.getComentario());
    }

    @Test
    void testAtualizarNotaComSucesso() {
        avaliacao.setNota(4);
        assertEquals(4, avaliacao.getNota());
    }

    @Test
    void testAtualizarNotaInvalida() {
        assertThrows(AvaliacaoRuntimeException.class, () -> avaliacao.setNota(-1));
        assertThrows(AvaliacaoRuntimeException.class, () -> avaliacao.setNota(6));
    }
}