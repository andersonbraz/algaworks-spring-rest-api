package br.com.exemplo.model;

public enum TipoSegmentoC {
	
	TIPO_C_200(200),
	TIPO_C_300(300),
	TIPO_C_400(400),
	TIPO_C_500(500);
	
	private final int valorSegmentoC;
	
	TipoSegmentoC(int valor) {
		this.valorSegmentoC = valor;
	}
	
	public int getValorSegmento() {
		return valorSegmentoC;
	}
	
	public TipoSegmento getSegmento() {
		return TipoSegmento.TIPO_C;
	}

}
