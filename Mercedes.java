package br.com.stefanini.orientacaoObjetos;

public class Mercedes extends Carro {
	
	public Mercedes ( ) {
		this.setMarca("Mercedes");
	}
	
	@Override
	public String acelerar() {
		return "A Mercedes tem uma acelera��o para cada Modelo" ;
	}

}
