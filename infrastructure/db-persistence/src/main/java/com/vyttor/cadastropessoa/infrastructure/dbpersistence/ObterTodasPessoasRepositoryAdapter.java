package com.vyttor.cadastropessoa.infrastructure.dbpersistence;

import com.vyttor.cadastropessoa.infrastructure.dbpersistence.entity.PessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.mappers.MapperPessoaPessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.repository.PessoaRepository;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out.ObterTodasPessoasRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ObterTodasPessoasRepositoryAdapter implements ObterTodasPessoasRepositoryPort {

    private final PessoaRepository pessoaRepository;
    private final MapperPessoaPessoaEntity mapperPessoaPessoaEntity;

    @Override
    public List<Pessoa> listar() {
        List<PessoaEntity> pessoaEntityList = pessoaRepository.findAll();

        return pessoaEntityList
                .stream()
                .map(pessoaEntity -> mapperPessoaPessoaEntity.toModel(pessoaEntity))
                .collect(Collectors.toList());
    }
}
