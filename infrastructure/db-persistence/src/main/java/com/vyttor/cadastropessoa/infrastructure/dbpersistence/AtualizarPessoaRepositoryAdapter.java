package com.vyttor.cadastropessoa.infrastructure.dbpersistence;

import com.vyttor.cadastropessoa.infrastructure.dbpersistence.entity.PessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.mappers.MapperPessoaPessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.repository.PessoaRepository;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out.AtualizarPessoaRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AtualizarPessoaRepositoryAdapter implements AtualizarPessoaRepositoryPort {

    private final PessoaRepository pessoaRepository;
    private final MapperPessoaPessoaEntity mapperPessoaPessoaEntity;

    @Override
    public Pessoa atualizar(Pessoa pessoa) {
        PessoaEntity pessoaEntity = mapperPessoaPessoaEntity.toEntity(pessoa);

        pessoaRepository.save(pessoaEntity);

        return mapperPessoaPessoaEntity.toModel(pessoaEntity);
    }
}
