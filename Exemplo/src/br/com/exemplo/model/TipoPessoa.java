package br.com.exemplo.model;

public interface TipoPessoa {
	/**
	 * 200, 213, 9004
	 * 200, 478, 9004
	 * 300, 568, 9004
	 * 300, 478, 8010
	 * 415, 490, 9004
	 */
	public int[] CAMPO_ALFA = {200, 300, 400, 500};
	public int[] CAMPO_BETA = {600, 700, 800, 900};
	public int[][] CAMPO_GAMA = {
			{200, 213, 9004},
			{200, 478, 8010},
			{200, 490, 9004},
	};
}
