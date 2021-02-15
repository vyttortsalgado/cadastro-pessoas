package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;

public interface CadastrarPessoaRepositoryPort {
    public Pessoa salvar(Pessoa pessoa);
}
