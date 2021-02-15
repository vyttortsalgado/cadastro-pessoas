package com.vyttor.cadastropessoa.infrastructure.restclient.mappers;

import com.vyttor.cadastropessoa.infrastructure.restclient.dto.response.PessoaResponse;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperPessoaPessoaResponse {
    public PessoaResponse toDto(Pessoa pessoa);
}
