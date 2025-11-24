package atributosmetodos;

public class Main {
	
	public static void main(String[] args) {
		
		// Creacion de alumno
		Alumno pablo = new Alumno(1, "Pablo", "Ramirez");
		
		
		System.out.println("El id de pablo es: " + pablo.getId());
		System.out.println("El nombre es: " + pablo.getNombre());
		
	}

}
