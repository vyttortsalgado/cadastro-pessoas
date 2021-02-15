package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.exceptions;

public class CpfDifferenceException extends RuntimeException {
    public CpfDifferenceException(String message) {
        super(message);
    }
}
