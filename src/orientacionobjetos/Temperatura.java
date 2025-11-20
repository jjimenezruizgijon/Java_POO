package orientacionobjetos;

public class Temperatura {

	public static void main(String[] args) {
		
		Termostato principal = new Termostato(22);
		
		principal.encender();
		principal.comprobarTemp();
	}
	
}
