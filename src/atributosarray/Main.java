package atributosarray;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		Mochila pepe = new Mochila("Negra");
		
		System.out.println("Añade cosas a la mochila");
		
		for (int i = 0; i < pepe.bolillos.length ; i++) {
			pepe.bolillos[i] = sc.nextLine();
		}
		
		pepe.enseñarMochila();
		
		sc.close();
		
	}

}
