package com.vyttor.cadastropessoa.adapters.out.pessoa.mappers;

import com.vyttor.cadastropessoa.adapters.out.pessoa.entity.PessoaEntity;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperPessoaPessoaEntity {
    public PessoaEntity toEntity(Pessoa pessoa);
    public Pessoa toModel(PessoaEntity pessoaEntity);
}
