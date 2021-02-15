package com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters;

import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.exceptions.CpfDifferenceException;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.models.Pessoa;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.AtualizarPessoaPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ObterPessoaPorIdPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ValidarPessoaPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.out.AtualizarPessoaRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AtualizarPessoaAdapter implements AtualizarPessoaPort {

    private final ObterPessoaPorIdPort obterPessoaPorIdPort;
    private final AtualizarPessoaRepositoryPort atualizarPessoaRepositoryPort;
    private final ValidarPessoaPort validarPessoaPort;

    @Override
    public Pessoa atualizar(Pessoa pessoa) {
        validarPessoaPort.validar(pessoa);

        Pessoa pessoaDb = obterPessoaPorIdPort.obterPorId(pessoa.getId());

        if( !pessoaDb.getCpf().equals( pessoa.getCpf() ) ){
            throw new CpfDifferenceException("Tentativa de alterar cpf não é válida");
        }

        mapperAtualizacao( pessoaDb, pessoa );

        atualizarPessoaRepositoryPort.atualizar( pessoaDb );

        return pessoaDb;
    }

    private void mapperAtualizacao(Pessoa source, Pessoa target){
        target.setNome( source.getNome() );
        target.setSobrenome( source.getSobrenome() );
        target.setDataNascimento( source.getDataNascimento() );
    }
}
