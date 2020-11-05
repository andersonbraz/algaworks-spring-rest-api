package com.algaworks.domain.util;

public enum Classificacao {
	
	A(1),
	B(2),
	C(3),
	D(4);
	
	private final int valor;

	Classificacao(int valorClassificacao){
		valor = valorClassificacao;
	}
	
	public int getValor() {
		return valor;
	}
	
}
