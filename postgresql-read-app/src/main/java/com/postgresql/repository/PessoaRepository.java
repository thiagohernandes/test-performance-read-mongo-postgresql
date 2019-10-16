package com.postgresql.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.domain.Pessoa;

@Repository
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa,Integer>{

}
