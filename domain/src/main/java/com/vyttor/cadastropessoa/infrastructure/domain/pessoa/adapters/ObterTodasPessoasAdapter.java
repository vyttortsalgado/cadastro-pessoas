package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ObterTodasPessoasPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out.ObterTodasPessoasRepositoryPort;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
public class ObterTodasPessoasAdapter implements ObterTodasPessoasPort {

    private final ObterTodasPessoasRepositoryPort obterTodasPessoasRepositoryPort;

    @Override
    public List<Pessoa> listar() {
        List<Pessoa> pessoaList = obterTodasPessoasRepositoryPort.listar();

        if(Objects.isNull( pessoaList )){
            pessoaList = new ArrayList<>();
        }

        Pessoa pessoaVirtualNinguem = new Pessoa();
        pessoaVirtualNinguem.setNome("Nenhuma");
        pessoaVirtualNinguem.setSobrenome("Seleção");
        pessoaVirtualNinguem.setDataNascimento( LocalDate.now() );
        pessoaVirtualNinguem.setCpf("12345678912");
        pessoaVirtualNinguem.setId(0L);

        pessoaList.add(pessoaVirtualNinguem);

        return pessoaList;
    }
}
