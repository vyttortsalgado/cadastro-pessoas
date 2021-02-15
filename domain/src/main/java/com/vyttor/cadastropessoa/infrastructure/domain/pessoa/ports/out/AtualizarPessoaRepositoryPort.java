package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;

public interface AtualizarPessoaRepositoryPort {
    public Pessoa atualizar(Pessoa pessoa);
}
