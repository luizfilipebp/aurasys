package br.com.fiap.core.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("João Silva", "joao.silva@email.com", "123456789");
    }

    @Test
    void testCriarClienteComSucesso() {
        assertEquals("João Silva", cliente.getNome());
        assertEquals("joao.silva@email.com", cliente.getEmail());
        assertEquals("123456789", cliente.getTelefone());
        assertTrue(cliente.getAvaliacoes().isEmpty());
    }

    @Test
    void testAtualizarNomeComSucesso() {
        cliente.setNome("Maria Oliveira");
        assertEquals("Maria Oliveira", cliente.getNome());
    }

    @Test
    void testAtualizarEmailComSucesso() {
        cliente.setEmail("maria.oliveira@email.com");
        assertEquals("maria.oliveira@email.com", cliente.getEmail());
    }

    @Test
    void testAtualizarTelefoneComSucesso() {
        cliente.setTelefone("987654321");
        assertEquals("987654321", cliente.getTelefone());
    }

    @Test
    void testAdicionarAvaliacaoComSucesso() {
        Avaliacao avaliacao = new Avaliacao(5, "Excelente serviço", cliente, null, null);
        cliente.adicionarAvaliacao(avaliacao);

        assertEquals(1, cliente.getAvaliacoes().size());
        assertEquals(avaliacao, cliente.getAvaliacoes().get(0));
    }
}