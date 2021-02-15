package com.vyttor.cadastropessoa.infrastructure.restclient.services;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ObterPessoaPorIdPort;
import com.vyttor.cadastropessoa.infrastructure.restclient.dto.response.PessoaResponse;
import com.vyttor.cadastropessoa.infrastructure.restclient.mappers.MapperPessoaPessoaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ObterPessoaPorIdService {
    private final ObterPessoaPorIdPort obterPessoaPorIdPort;
    private final MapperPessoaPessoaResponse mapperPessoaPessoaResponse;

    public PessoaResponse obter(Long id){
        Pessoa pessoa = obterPessoaPorIdPort.obterPorId(id);

        return mapperPessoaPessoaResponse.toDto(pessoa);
    }
}
