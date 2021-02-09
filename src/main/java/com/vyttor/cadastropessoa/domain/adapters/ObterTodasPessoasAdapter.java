package com.vyttor.cadastropessoa.domain.adapters;

import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.in.ObterTodasPessoasPort;
import com.vyttor.cadastropessoa.domain.ports.out.ObterTodasPessoasRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
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
        pessoaVirtualNinguem.setNome("Nenhum");
        pessoaVirtualNinguem.setSobrenome("Seleção");
        pessoaVirtualNinguem.setDataNascimento( LocalDate.now() );
        pessoaVirtualNinguem.setCpf("12345678912");
        pessoaVirtualNinguem.setId(0L);

        pessoaList.add(pessoaVirtualNinguem);

        return pessoaList;
    }
}
