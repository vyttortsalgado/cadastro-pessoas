package com.vyttor.cadastropessoa.adapters.out.pessoa.repository;

import com.vyttor.cadastropessoa.adapters.out.pessoa.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
