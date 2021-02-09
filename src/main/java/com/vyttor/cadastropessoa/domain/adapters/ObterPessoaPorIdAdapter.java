package com.vyttor.cadastropessoa.domain.adapters;

import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.out.ObterPessoaPorIdRepositoryPort;
import com.vyttor.cadastropessoa.domain.ports.in.ObterPessoaPorIdPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ObterPessoaPorIdAdapter implements ObterPessoaPorIdPort {

    private final ObterPessoaPorIdRepositoryPort obterPessoaPorIdRepositoryPort;

    @Override
    public Pessoa obterPorId(Long id) {
        return obterPessoaPorIdRepositoryPort.obterPorId(id);
    }
}
