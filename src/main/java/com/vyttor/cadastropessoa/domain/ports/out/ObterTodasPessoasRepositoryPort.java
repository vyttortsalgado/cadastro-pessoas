package com.vyttor.cadastropessoa.domain.ports.out;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

import java.util.List;

public interface ObterTodasPessoasRepositoryPort {
    public List<Pessoa> listar();
}
