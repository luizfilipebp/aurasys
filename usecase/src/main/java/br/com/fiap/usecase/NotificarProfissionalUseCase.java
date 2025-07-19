package br.com.fiap.usecase;

public interface NotificarProfissionalUseCase {

    boolean notificar(String profissionalId, String mensagem) throws Exception;
}
