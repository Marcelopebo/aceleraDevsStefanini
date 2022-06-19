package br.com.aceleradevs.stefanini.breakContinue;

public class BreakContinue {

	public static void main(String[] args) {
		
		String [ ] carros = new String [ ] {"BMW", "MERCEDES", "VW","AUDI"};
		
		for ( int i = 0; i < carros.length; i++) {
			if (carros[i]=="BMW") {
			System.out.println(carros [i]);
			break;
		}
			
			System.out.println(carros [i]);

	}

}
}
