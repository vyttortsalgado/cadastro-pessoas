package com.vyttor.cadastropessoa.adapters.out.pessoa;

import com.vyttor.cadastropessoa.adapters.out.pessoa.entity.PessoaEntity;
import com.vyttor.cadastropessoa.adapters.out.pessoa.mappers.MapperPessoaPessoaEntity;
import com.vyttor.cadastropessoa.adapters.out.pessoa.repository.PessoaRepository;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.out.AtualizarPessoaRepositoryPort;
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