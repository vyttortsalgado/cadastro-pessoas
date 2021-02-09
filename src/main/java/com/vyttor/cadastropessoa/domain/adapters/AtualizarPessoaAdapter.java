package com.vyttor.cadastropessoa.domain.adapters;

import com.vyttor.cadastropessoa.domain.exceptions.CpfDifferenceException;
import com.vyttor.cadastropessoa.domain.models.Pessoa;
import com.vyttor.cadastropessoa.domain.ports.in.AtualizarPessoaPort;
import com.vyttor.cadastropessoa.domain.ports.out.AtualizarPessoaRepositoryPort;
import com.vyttor.cadastropessoa.domain.ports.in.ObterPessoaPorIdPort;
import com.vyttor.cadastropessoa.domain.ports.in.ValidarPessoaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
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

        //Não permito atualizar cpf
//        target.setCpf( source.getCpf() );
    }
}
