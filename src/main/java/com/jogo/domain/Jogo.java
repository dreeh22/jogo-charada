package com.jogo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="tb_jogo")
public class Jogo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Column(nullable = false, length = 80)
	private String nome;
	
	@NotBlank
	@Column(nullable = false)
	private String resposta1;
	
	@NotBlank
	@Column(nullable = false)
	private String resposta2;
	
	@NotBlank
	@Column(nullable = false)
	private String resposta3;
	
	@NotBlank
	@Column(nullable = false)
	private String resposta4;
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResposta1() {
		return resposta1;
	}

	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}

	public String getResposta2() {
		return resposta2;
	}

	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}

	public String getResposta3() {
		return resposta3;
	}

	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}

	public String getResposta4() {
		return resposta4;
	}

	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}

	

	

}
