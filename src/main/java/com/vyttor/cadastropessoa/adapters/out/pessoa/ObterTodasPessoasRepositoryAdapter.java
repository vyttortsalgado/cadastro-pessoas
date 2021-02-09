package com.vyttor.cadastropessoa.adapters.out.pessoa;

import com.vyttor.cadastropessoa.adapters.out.pessoa.entity.PessoaEntity;
import com.vyttor.cadastropessoa.adapters.out.pessoa.mappers.MapperPessoaPessoaEntity;
import com.vyttor.cadastropessoa.adapters.out.pessoa.repository.PessoaRepository;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.out.ObterTodasPessoasRepositoryPort;
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
