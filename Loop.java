package br.com.aceleradevs.stefanini.estruturascontrole;

public class Loop {

	public static void main(String[] args) {
		
		int contador = 0;
		int contadorDois = 0;
		
		while (contador <= 10) {
			
			System.out.println("Contador " + contador );
			contador++;
		}
		
		do {
			System.out.println("ContadorDois " + contadorDois);
			contadorDois++;
		} while ( contadorDois <= 15 );
		
		
		for ( int i = 0; i <= 10; i++) {
			System.out.println("i é igual a: " + i);
		}
		
		int j = 0;
	
		for ( ;j <= 10;){
						System.out.println("j é igual a: " + j);
						j++;
		}

	}

}
