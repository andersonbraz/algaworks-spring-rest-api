package com.algaworks.domain.util;

public enum Classificacao {
	
	ADULTO(1),
	MENOR_INCAPAZ(2),
	MENOR_CAPAZ(3);
	
	private int valor;

	Classificacao(int valorClassificacao){
		this.valor = valorClassificacao;
	}
	
	public int getValor() {
		return valor;
	}
	
}
