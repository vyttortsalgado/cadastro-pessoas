package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.CadastrarPessoaPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ValidarPessoaPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out.CadastrarPessoaRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarPessoaAdapter implements CadastrarPessoaPort {

    private final CadastrarPessoaRepositoryPort cadastrarPessoaRepositoryPort;
    private final ValidarPessoaPort validarPessoaPort;

    @Override
    public Pessoa cadastrar(Pessoa pessoa) {
        //Validação
        validarPessoaPort.validar(pessoa);

        Pessoa pessoaCadastrada = cadastrarPessoaRepositoryPort.salvar(pessoa);

        return pessoaCadastrada;
    }
}
