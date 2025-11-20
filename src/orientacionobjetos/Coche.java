package orientacionobjetos;

public class Coche {
	
	private String marca;
	private String modelo;
	private int anio;
	
	public Coche(String marca, String modelo, int anio) {
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
	}
	
	public void arrancar() {
		System.out.println("El coche " + modelo + marca + anio + " ha arrancado");
	}
	

}
