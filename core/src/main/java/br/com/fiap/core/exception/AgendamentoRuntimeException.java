package br.com.fiap.core.exception;

public class AgendamentoRuntimeException extends RuntimeException {

    public AgendamentoRuntimeException(String message) {
        super(message);
    }

    public AgendamentoRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}