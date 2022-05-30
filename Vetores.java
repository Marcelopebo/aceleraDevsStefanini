package br.com.aceleradevs.stefanini;

public class Vetores {
	
	public static void main (String [] args){
		
		int [ ] media = new int [ 5 ];
		media [ 0 ] = 10;
		media [ 1 ] = 8;
		media [ 4 ] = 9;
		
		System.out.println ( media.length );
		
		for ( int i = 0; i < media.length; i++ ){
			System.out.println (media [ i ]);
		}
		
		
		String [ ] mamiferos = new String [ ] {"Leão", "Leoa", "Leopardo", "Tigre"};
		
		System.out.println ( mamiferos.length );
		
		for ( String mamifero : mamiferos ){
		System.out.println ( mamifero );
		}
		
		
		int [ ] [ ] diaNasci = new int [ 6 ] [ 6 ];
		diaNasci [ 0 ] [ 1 ] = 22;
		diaNasci [ 2 ] [ 3 ] = 12;
		diaNasci [ 4 ] [ 5 ] = 31;

		for (int [] dn : diaNasci){
			for (int nd : dn ){
				System.out.println (nd);
			}
		}	
		
	}
	
}
