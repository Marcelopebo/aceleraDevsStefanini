package br.com.stefanini.orientacaoObjetos;

public class BMW extends Carro{
	
	public BMW ( ) {
		this.setMarca("BMW");
		}
	
	@Override
	public String acelerar ( ) {
		return "A BMW pode fazer de 0 a " + this.getVelocidade() + "  Km's em 5s !!!"; 
	}
	
	
}
