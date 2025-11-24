package atributosmetodos;

public class Alumno {

	// Atributos
	
	int id;
	String nombre;
	String apellido;
		
	// Constructor
	
	public Alumno(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// Metodos
	
	public void mostrarNombre() {
		
	}


}
