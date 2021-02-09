package com.vyttor.cadastropessoa.domain.ports.in;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface AtualizarPessoaPort {
    public Pessoa atualizar(Pessoa pessoa);
}
