package com.vyttor.cadastropessoa.adapters.out.pessoa;

import com.vyttor.cadastropessoa.adapters.out.pessoa.entity.PessoaEntity;
import com.vyttor.cadastropessoa.adapters.out.pessoa.mappers.MapperPessoaPessoaEntity;
import com.vyttor.cadastropessoa.adapters.out.pessoa.repository.PessoaRepository;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.out.ObterPessoaPorIdRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ObterPessoaPorIdRepositoryAdapter implements ObterPessoaPorIdRepositoryPort {

    private final PessoaRepository pessoaRepository;
    private final MapperPessoaPessoaEntity mapperPessoaPessoaEntity;

    @Override
    public Pessoa obterPorId(Long id) {
        PessoaEntity pessoaEntity = pessoaRepository.findById(id).get();

        return mapperPessoaPessoaEntity.toModel(pessoaEntity);
    }
}
