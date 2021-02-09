package com.vyttor.cadastropessoa.adapters.in.pessoa.mappers;

import com.vyttor.cadastropessoa.adapters.in.pessoa.dto.response.PessoaResponse;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperPessoaPessoaResponse {
    public PessoaResponse toDto(Pessoa pessoa);
}
