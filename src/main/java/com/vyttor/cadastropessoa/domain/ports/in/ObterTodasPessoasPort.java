package com.vyttor.cadastropessoa.domain.ports.in;

import com.vyttor.cadastropessoa.domain.models.Pessoa;

import java.util.List;

public interface ObterTodasPessoasPort {
    public List<Pessoa> listar();
}
