package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;

import java.util.List;

public interface ObterTodasPessoasRepositoryPort {
    public List<Pessoa> listar();
}
