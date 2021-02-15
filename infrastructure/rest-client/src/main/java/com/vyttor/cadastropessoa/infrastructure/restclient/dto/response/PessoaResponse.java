package com.vyttor.cadastropessoa.infrastructure.restclient.dto.response;

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
