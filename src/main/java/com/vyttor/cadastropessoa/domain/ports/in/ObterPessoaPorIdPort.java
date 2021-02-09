package com.vyttor.cadastropessoa.domain.ports.in;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface ObterPessoaPorIdPort {
    public Pessoa obterPorId(Long id);
}
