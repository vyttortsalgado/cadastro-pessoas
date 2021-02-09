package com.vyttor.cadastropessoa.domain.ports.in;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface DeletarPessoaPort {
    public void deletar(Pessoa pessoa);
}
