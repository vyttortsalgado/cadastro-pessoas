package com.vyttor.cadastropessoa.adapters.in.pessoa.mappers;

import com.vyttor.cadastropessoa.adapters.in.pessoa.dto.request.PessoaRequest;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperPessoaRequestPessoa {
    public Pessoa toModel(PessoaRequest pessoaRequest);
}
