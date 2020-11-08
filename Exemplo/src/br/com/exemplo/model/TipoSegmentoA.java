package br.com.exemplo.model;

public enum TipoSegmentoA {
	
	TIPO_A_200(200),
	TIPO_A_300(300),
	TIPO_A_400(400),
	TIPO_A_500(500);
	
	private final int valorSegmentoA;
	
	TipoSegmentoA(int valor) {
		this.valorSegmentoA = valor;
	}
	
	public int getValorSegmento() {
		return valorSegmentoA;
	}
	
	public TipoSegmento getSegmento() {
		return TipoSegmento.TIPO_A;
	}

}
