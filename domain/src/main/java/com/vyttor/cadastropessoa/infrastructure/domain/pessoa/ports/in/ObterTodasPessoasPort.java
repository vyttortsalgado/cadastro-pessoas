package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;

import java.util.List;

public interface ObterTodasPessoasPort {
    public List<Pessoa> listar();
}
