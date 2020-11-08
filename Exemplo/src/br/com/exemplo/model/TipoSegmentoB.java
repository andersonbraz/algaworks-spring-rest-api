package br.com.exemplo.model;

public enum TipoSegmentoB {
	
	TIPO_B_200(200),
	TIPO_B_300(300),
	TIPO_B_400(400),
	TIPO_B_500(500);
	
	private final int valorSegmentoB;
	
	TipoSegmentoB(int valor) {
		this.valorSegmentoB = valor;
	}
	
	public int getValorSegmento() {
		return valorSegmentoB;
	}
	
	public TipoSegmento getSegmento() {
		return TipoSegmento.TIPO_B;
	}

}
