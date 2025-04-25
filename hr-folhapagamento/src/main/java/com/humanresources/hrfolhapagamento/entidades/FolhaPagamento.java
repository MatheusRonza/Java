package com.humanresources.hrfolhapagamento.entidades;

import java.io.Serializable;

public class FolhaPagamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double salario_dia ;
	private Integer dias;
	
	public FolhaPagamento() {
		
	}

	public FolhaPagamento(String nome, Double salario_dia, Integer dias) {
		super();
		this.nome = nome;
		this.salario_dia = salario_dia;
		this.dias = dias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario_dia() {
		return salario_dia;
	}

	public void setSalario_dia(Double salario_dia) {
		this.salario_dia = salario_dia;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public double getTotal() {
		return dias * salario_dia;
	}
}
