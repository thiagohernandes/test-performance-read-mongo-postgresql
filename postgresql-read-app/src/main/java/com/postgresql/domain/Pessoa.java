package com.postgresql.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(schema="public", name="tbl_pessoas")
@JsonInclude(Include.ALWAYS)
@SequenceGenerator(name="seq-gen", allocationSize=1)
@Data
@NoArgsConstructor
public class Pessoa {
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="tbl_pessoas_id_seq")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
	private Integer id;
	private String nome;
	private int idade;
	
}
