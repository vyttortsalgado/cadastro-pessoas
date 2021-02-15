package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ObterPessoaPorIdPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out.ObterPessoaPorIdRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObterPessoaPorIdAdapter implements ObterPessoaPorIdPort {

    private final ObterPessoaPorIdRepositoryPort obterPessoaPorIdRepositoryPort;

    @Override
    public Pessoa obterPorId(Long id) {
        return obterPessoaPorIdRepositoryPort.obterPorId(id);
    }
}
