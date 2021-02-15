package com.vyttor.cadastropessoa.infrastructure.restclient.services;

import com.vyttor.cadastropessoa.infrastructure.restclient.dto.response.PessoaResponse;
import com.vyttor.cadastropessoa.infrastructure.restclient.mappers.MapperPessoaPessoaResponse;
import com.vyttor.cadastropessoa.infrastructure.restclient.mappers.MapperPessoaRequestPessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ObterTodasPessoasPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListarTodasPessoasService {

    private final ObterTodasPessoasPort obterTodasPessoasPort;
    private final MapperPessoaRequestPessoa mapperPessoaRequestPessoa;
    private final MapperPessoaPessoaResponse mapperPessoaPessoaResponse;

    public List<PessoaResponse> listar(){
        //Programação funcional maior parte
        //está ligado ao stream, e ao optional

        return obterTodasPessoasPort.listar()
                .stream()
                .map(mapperPessoaPessoaResponse::toDto)
                .collect(Collectors.toList());
    }
}
