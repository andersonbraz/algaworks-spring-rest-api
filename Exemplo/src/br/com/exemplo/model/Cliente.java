package br.com.exemplo.model;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Cliente {
	
	public String nome;
	public String telefone;
	public String email;
	public TipoPessoa tipo;
	
//	public int[] campoXadrez ;
	
	/*
	 * 
	 * TipoA = campoAlfa com valores: 200, 300, 400, 500
	 * 
	 * TipoB = campoAlfa com valores: 600, 700, 800, 900
	 * 
	 * TipoC = 
	 * 
	 * campoAlfa, campoBeta, campoXadrez
	 * 
	 * 200, 213, 9004
	 * 200, 478, 9004
	 * 300, 568, 9004
	 * 300, 478, 8010
	 * 415, 490, 9004
	 * 
	 * 
	 */
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public TipoPessoa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	public TipoPessoa checarTipo(int tipo, int ...t) {
		if (IntStream.of(TipoPessoa.CAMPO_ALFA).anyMatch(x -> x == tipo))
			return new TipoA();

		if (IntStream.of(TipoPessoa.CAMPO_BETA).anyMatch(x -> x == tipo))
			return new TipoB();

		List<Integer> rowvalues = Arrays.asList(Arrays.asList(TipoPessoa.CAMPO_GAMA).get(tipo));
		if (Arrays.asList(TipoPessoa.CAMPO_GAMA).a(x -> x == tipo))
			return new TipoC();
		
		return null;
	}
}
