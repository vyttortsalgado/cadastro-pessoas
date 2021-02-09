package com.vyttor.cadastropessoa.domain.ports.out;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface ObterPessoaPorIdRepositoryPort {
    public Pessoa obterPorId(Long id);
}
