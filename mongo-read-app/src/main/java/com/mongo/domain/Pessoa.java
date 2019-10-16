package com.mongo.domain;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection= "pessoas")
public class Pessoa {

	@Id
	private ObjectId _id;
	private String data;
	private double valor;
	private String operacao;
	
}
