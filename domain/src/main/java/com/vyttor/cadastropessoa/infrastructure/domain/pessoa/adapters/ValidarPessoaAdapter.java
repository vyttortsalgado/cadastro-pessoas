package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.exceptions.PessoaNotValidException;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ValidarPessoaPort;

import java.util.Objects;

public class ValidarPessoaAdapter implements ValidarPessoaPort {

    @Override
    public void validar(Pessoa pessoa) {
        if (
                Objects.isNull( pessoa ) ||
                Objects.isNull( pessoa.getNome() ) ||
                pessoa.getNome().equals("") ||

                Objects.isNull( pessoa.getSobrenome() ) ||
                pessoa.getSobrenome().equals("") ||

                Objects.isNull( pessoa.getDataNascimento() ) ||

                Objects.isNull( pessoa.getCpf() )  ||
                pessoa.getCpf().equals("")
        ) {
            throw new PessoaNotValidException("Todos os dados de pessoa devem estar preenchidos. " + pessoa);
        }
    }
}
