package com.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.domain.Pessoa;
import com.mongo.service.PessoaService;


@RestController
@RequestMapping("/api-pessoas-mongodb")
public class PessoaController {

	@Autowired
	private PessoaService service;
	
	@GetMapping("/{pos-inicial}/{pos-final}")
	public ResponseEntity<Page<Pessoa>> getAllPessoas(@PathVariable("pos-inicial") int posInicial,
													  @PathVariable("pos-final") int posFinal){
		Pageable pageable = PageRequest.of(posInicial, posFinal);
		return ResponseEntity.ok(service.getAllPessoas(pageable));
	}
}
