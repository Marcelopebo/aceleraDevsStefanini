package br.com.stefanini.orientacaoObjetos;

public class Carro {
	
		
	private String modelo;
	private int chassi;
	private  String placa;
	private int roda;
	private int bancos;
	private String marca;
	private int velocidade;
	private int velMaxima;

	
	
	public Carro ( ) {
		System.out.println("Construindo um carro ... ");
	}
	
	public Carro ( String marca ) {
		this.marca = marca;
		
	}
	
	
	public String acelerar ( ) {
		return "De 0 Km´s/h até  " + this.getVelocidade() + " Km/h";
	}
	
	public String frear ( ) {
		return "Freiando de  " + this.getVelocidade() + " Km´s/h até 0 Km´s/h";
	}
	
	public double calcuTaxaAcelera ( double VelFinal, double VelInic, double TempoFin, double TempoIni ) {
		return (VelFinal - VelInic) / (TempoFin - TempoIni) * 3.6;
	}
	
		
	public int getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(int velMaxima) {
		if (velMaxima < 0) {
			System.out.println("Valor Inválido !!!");
		} else {
			this.velMaxima = velMaxima;
		}
	}

	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


		public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getChassi() {
		return this.chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getRoda() {
		return this.roda;
	}

	public void setRoda(int roda) {
		this.roda = roda;
	}

	public int getBancos() {
		return this.bancos;
	}

	public void setBancos(int bancos) {
		this.bancos = bancos;
	}

	
	void acelera ( ) {
		System.out.println("Acelerando...");
	}
	
	void freia ( ) {
		System.out.println("Freiando...");
	}
	
	double calculoTaxaAceleracao (double VelFinal, double VelInicial, double tempoFinal, double tempoInicial ) {
		return (VelFinal - VelInicial) / (tempoFinal - tempoInicial) * 3.6;
		
	
	}

}
