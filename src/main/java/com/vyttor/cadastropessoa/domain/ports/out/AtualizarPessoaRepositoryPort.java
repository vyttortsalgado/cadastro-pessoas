package com.vyttor.cadastropessoa.domain.ports.out;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface AtualizarPessoaRepositoryPort {
    public Pessoa atualizar(Pessoa pessoa);
}
