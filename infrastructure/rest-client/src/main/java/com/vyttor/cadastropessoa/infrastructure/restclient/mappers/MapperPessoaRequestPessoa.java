package com.vyttor.cadastropessoa.infrastructure.restclient.mappers;

import com.vyttor.cadastropessoa.infrastructure.restclient.dto.request.PessoaRequest;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperPessoaRequestPessoa {
    public Pessoa toModel(PessoaRequest pessoaRequest);
}
