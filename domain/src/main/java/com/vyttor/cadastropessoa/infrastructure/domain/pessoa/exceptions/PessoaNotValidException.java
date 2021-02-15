package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.exceptions;

public class PessoaNotValidException extends RuntimeException{
    public PessoaNotValidException(String message) {
        super(message);
    }
}
