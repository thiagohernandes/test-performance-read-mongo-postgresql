package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.domain.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa,Integer>{

}
