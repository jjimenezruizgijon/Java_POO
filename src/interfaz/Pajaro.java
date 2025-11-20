package interfaz;

public class Pajaro implements Volar {
	
	private String raza;
	private String nombre;
	
	public Pajaro(String raza, String nombre) {
		super();
		this.raza = raza;
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void velocidadVuelo() {
		System.out.println("Mucha");
	}

}
