package com.vyttor.cadastropessoa.infrastructure.dbpersistence;

import com.vyttor.cadastropessoa.infrastructure.dbpersistence.entity.PessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.mappers.MapperPessoaPessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.repository.PessoaRepository;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out.ObterPessoaPorIdRepositoryPort;
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