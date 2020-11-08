package br.com.exemplo.model;

public enum TipoSegmento {
	TIPO_A(1),
	TIPO_B(2),
	TIPO_C(3);
	
	private final int valorSgmento;
	
	TipoSegmento(int valor) {
		this.valorSgmento = valor;
	}
	
	public int getValorSegmento() {
		return valorSgmento;
	}
	
}
