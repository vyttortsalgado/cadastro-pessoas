package com.vyttor.cadastropessoa.infrastructure.dbpersistence.repository;

import com.vyttor.cadastropessoa.infrastructure.dbpersistence.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
