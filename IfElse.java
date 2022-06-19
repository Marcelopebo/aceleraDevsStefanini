package br.com.aceleradevs.stefanini.estruturascontrole;

public class IfElse {
	
	public static void main (String [ ] args ) {
		
		int idade = 15;
		
		if (idade >= 18 ) {
			System.out.println("Pode entrar !");
		}
		
		
		if (idade >= 18 ) {
			System.out.println("Maior de Idade ! Pode entrar !");
		} else {
			System.out.println("Somente acompanhado !");
		}
		
		
		if (idade >= 100 ) {
			System.out.println("Já virou Múmia");
		} else if ( idade == 18 ) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("Menor de Idade");
		}
		
		
		
			
		
	}

}
