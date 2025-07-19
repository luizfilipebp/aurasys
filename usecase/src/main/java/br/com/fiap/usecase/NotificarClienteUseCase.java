package br.com.fiap.usecase;

public interface NotificarClienteUseCase {
    boolean notificar(String usuarioId, String mensagem) throws Exception;
}
