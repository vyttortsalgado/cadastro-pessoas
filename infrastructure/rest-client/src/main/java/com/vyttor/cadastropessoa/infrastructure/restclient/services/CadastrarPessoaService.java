package com.vyttor.cadastropessoa.infrastructure.restclient.services;

import com.vyttor.cadastropessoa.infrastructure.restclient.dto.request.PessoaRequest;
import com.vyttor.cadastropessoa.infrastructure.restclient.dto.response.PessoaResponse;
import com.vyttor.cadastropessoa.infrastructure.restclient.mappers.MapperPessoaPessoaResponse;
import com.vyttor.cadastropessoa.infrastructure.restclient.mappers.MapperPessoaRequestPessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.CadastrarPessoaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarPessoaService {

    private final CadastrarPessoaPort cadastrarPessoaPort;
    private final MapperPessoaRequestPessoa mapperPessoaRequestPessoa;
    private final MapperPessoaPessoaResponse mapperPessoaPessoaResponse;

    public PessoaResponse cadastrar(PessoaRequest pessoaRequest){
        Pessoa pessoa = mapperPessoaRequestPessoa.toModel(pessoaRequest);

        Pessoa pessoaCadastrada = cadastrarPessoaPort.cadastrar(pessoa);

        return mapperPessoaPessoaResponse.toDto( pessoaCadastrada );
    }
}
