package com.vyttor.cadastropessoa.domain.adapters;

import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.in.CadastrarPessoaPort;
import com.vyttor.cadastropessoa.domain.ports.out.CadastrarPessoaRepositoryPort;
import com.vyttor.cadastropessoa.domain.ports.in.ValidarPessoaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
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
