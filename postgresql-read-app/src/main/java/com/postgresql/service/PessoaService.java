package com.postgresql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.postgresql.domain.Pessoa;
import com.postgresql.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;
	
	public Page<Pessoa> getAllPessoas(Pageable pageable) {
		return repository.findAll(pageable);
	}
	
}
