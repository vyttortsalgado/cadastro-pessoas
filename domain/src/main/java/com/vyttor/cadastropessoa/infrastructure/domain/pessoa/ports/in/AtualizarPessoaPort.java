package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;

public interface AtualizarPessoaPort {
    public Pessoa atualizar(Pessoa pessoa);
}
