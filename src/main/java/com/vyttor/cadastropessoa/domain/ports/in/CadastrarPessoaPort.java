package com.vyttor.cadastropessoa.domain.ports.in;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface CadastrarPessoaPort {
    public Pessoa cadastrar(Pessoa pessoa);
}
