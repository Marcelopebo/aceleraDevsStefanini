package br.com.stefanini.orientacaoObjetos;

public class Executor {
	
	public static void main (String [ ] args ) {
		
				
		Carro carro1 = new Carro ( );
		carro1.setMarca("BMW");
		carro1.setModelo("3201i");
		carro1.setChassi(9999);
		carro1.setPlaca("AAA9999");
		carro1.setBancos(5);
		carro1.setRoda(20);
		carro1.setVelocidade(280);
		
		Carro carro2 = new Carro ("Mercedes");
		
		
		System.out.println("Marca  " + carro1.getMarca());
		System.out.println("Modelo " + carro1.getModelo());
		System.out.println("Placa  " + carro1.getPlaca ());
		System.out.println("Velocidade  " + carro1.acelerar());
		
		System.out.println(carro2.getMarca());
		
		System.out.println(soma (10 , 15));
		System.out.println(soma (10 , 10 , 10 ));
		
		BMW bmw = new BMW();
		System.out.println("Construido uma  " + bmw.getMarca());
		bmw.setVelocidade(120);
		bmw.setVelMaxima(280);
		System.out.println(bmw.acelerar());
		System.out.println(bmw.frear());
		System.out.println(bmw.calcuTaxaAcelera(bmw.getVelMaxima(), 0, 10, 0) + " Km´s/h");
		
		
		Tesla tesla = new Tesla ();
		tesla.isDirigeSozinho();
		
		Carro tesla2 = new Tesla();
		((Tesla) tesla2).setDirigeSozinho(true);
		System.out.println(((Tesla) tesla2).isDirigeSozinho());
				
	}
	
		public static int soma (int a, int b ) {
			return a + b;
		}
		
		public static int soma ( int a, int b, int c ) {
			return a + b + c;
		}
		
		
		

}
