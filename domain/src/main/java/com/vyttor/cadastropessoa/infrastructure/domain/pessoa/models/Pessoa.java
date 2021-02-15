package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pessoa {
    private Long id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String cpf;
}
