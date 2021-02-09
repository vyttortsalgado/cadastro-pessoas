package com.vyttor.cadastropessoa.domain.adapters;

import com.vyttor.cadastropessoa.domain.exceptions.PessoaNotValidException;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.in.ValidarPessoaPort;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
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
