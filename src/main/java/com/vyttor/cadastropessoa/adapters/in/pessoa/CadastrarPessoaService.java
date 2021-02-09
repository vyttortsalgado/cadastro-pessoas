package com.vyttor.cadastropessoa.adapters.in.pessoa;

import com.vyttor.cadastropessoa.adapters.in.pessoa.dto.request.PessoaRequest;
import com.vyttor.cadastropessoa.adapters.in.pessoa.dto.response.PessoaResponse;
import com.vyttor.cadastropessoa.adapters.in.pessoa.mappers.MapperPessoaPessoaResponse;
import com.vyttor.cadastropessoa.adapters.in.pessoa.mappers.MapperPessoaRequestPessoa;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.in.CadastrarPessoaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
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
