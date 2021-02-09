package com.vyttor.cadastropessoa.adapters.in.pessoa.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PessoaRequest {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String cpf;
}
