package br.com.fiap.core.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstabelecimentoTest {

    private Estabelecimento estabelecimento;

    @BeforeEach
    void setUp() {
        estabelecimento = new Estabelecimento("Salão Beleza", "Rua das Flores, 123", "123456789");
    }

    @Test
    void testCriarEstabelecimentoComSucesso() {
        assertEquals("Salão Beleza", estabelecimento.getNome());
        assertEquals("Rua das Flores, 123", estabelecimento.getEndereco());
        assertEquals("123456789", estabelecimento.getTelefone());
    }

    @Test
    void testAtualizarNomeComSucesso() {
        estabelecimento.setNome("Salão Estilo");
        assertEquals("Salão Estilo", estabelecimento.getNome());
    }

    @Test
    void testAtualizarEnderecoComSucesso() {
        estabelecimento.setEndereco("Avenida Central, 456");
        assertEquals("Avenida Central, 456", estabelecimento.getEndereco());
    }

    @Test
    void testAtualizarTelefoneComSucesso() {
        estabelecimento.setTelefone("987654321");
        assertEquals("987654321", estabelecimento.getTelefone());
    }
}