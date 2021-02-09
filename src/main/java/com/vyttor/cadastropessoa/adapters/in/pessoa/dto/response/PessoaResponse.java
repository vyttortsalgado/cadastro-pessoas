package com.vyttor.cadastropessoa.adapters.in.pessoa.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PessoaResponse {
    private Long id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String cpf;
}
