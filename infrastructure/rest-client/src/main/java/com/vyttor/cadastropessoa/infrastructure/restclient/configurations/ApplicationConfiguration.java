package com.vyttor.cadastropessoa.infrastructure.restclient.configurations;

import com.vyttor.cadastropessoa.infrastructure.dbpersistence.CadastrarPessoaRepositoryAdapter;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.ObterPessoaPorIdRepositoryAdapter;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.ObterTodasPessoasRepositoryAdapter;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.mappers.MapperPessoaPessoaEntity;
import com.vyttor.cadastropessoa.infrastructure.dbpersistence.repository.PessoaRepository;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters.CadastrarPessoaAdapter;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters.ObterPessoaPorIdAdapter;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters.ObterTodasPessoasAdapter;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.adapters.ValidarPessoaAdapter;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.CadastrarPessoaPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ObterPessoaPorIdPort;
import com.vyttor.cadastropessoa.infrastructure.domain.pessoa.ports.in.ObterTodasPessoasPort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Classe De Configuraçao responsavel por conectar todas as
//peças da arquitetura hexagonal separada por modulos

@Configuration
@RequiredArgsConstructor
public class ApplicationConfiguration {

    private final PessoaRepository pessoaRepository;
    private final MapperPessoaPessoaEntity mapperPessoaPessoaEntity;

    @Bean
    public CadastrarPessoaPort cadastrarPessoaPort(){
        return new CadastrarPessoaAdapter(
                new CadastrarPessoaRepositoryAdapter(
                        pessoaRepository,
                        mapperPessoaPessoaEntity
                ),
                new ValidarPessoaAdapter()
        );
    }

    @Bean
    public ObterTodasPessoasPort obterTodasPessoasPort(){
        return new ObterTodasPessoasAdapter(
                new ObterTodasPessoasRepositoryAdapter(
                        pessoaRepository,
                        mapperPessoaPessoaEntity
                )
        );
    }

    @Bean
    public ObterPessoaPorIdPort obterPessoaPorIdPort(){
        return new ObterPessoaPorIdAdapter(
                new ObterPessoaPorIdRepositoryAdapter(
                        pessoaRepository,
                        mapperPessoaPessoaEntity
                )
        );
    }
}
