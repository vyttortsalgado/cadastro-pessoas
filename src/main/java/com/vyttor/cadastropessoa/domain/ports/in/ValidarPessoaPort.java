package com.vyttor.cadastropessoa.domain.ports.in;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

public interface ValidarPessoaPort {
    public void validar(Pessoa pessoa);
}
