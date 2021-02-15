package com.vyttor.cadastropessoa.infrastructure.dbpersistence.mappers;

import com.vyttor.cadastropessoa.infrastructure.dbpersistence.entity.PessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperPessoaPessoaEntity {
    public PessoaEntity toEntity(Pessoa pessoa);
    public Pessoa toModel(PessoaEntity pessoaEntity);
}
