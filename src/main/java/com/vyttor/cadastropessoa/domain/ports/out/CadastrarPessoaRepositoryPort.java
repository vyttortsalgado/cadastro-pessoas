package com.vyttor.cadastropessoa.domain.ports.out;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface CadastrarPessoaRepositoryPort {
    public Pessoa salvar(Pessoa pessoa);
}
