package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Discente {

	@Getter
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorPessoa")
	@SequenceGenerator(name = "geradorPessoa", sequenceName = "gerador_pessoa_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	@Getter
	@Setter
	@Column(unique = true)
	private String matricula;

	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	@Column(unique = true)
	private String cpf;

	@Getter
	@Setter
	private String unidade;

	@Getter
	@Setter
	private String curso;

	@Getter
	@Setter
	private String nivel;

}
