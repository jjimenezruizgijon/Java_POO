package interfaz;

public class Avion implements Volar{
	
	private int añoFabricacion;
	private String pilotoEstrella;
	
	public Avion(int añoFabricacion, String pilotoEstrella) {
		super();
		this.añoFabricacion = añoFabricacion;
		this.pilotoEstrella = pilotoEstrella;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public String getPilotoEstrella() {
		return pilotoEstrella;
	}

	public void setPilotoEstrella(String pilotoEstrella) {
		this.pilotoEstrella = pilotoEstrella;
	}
	
	@Override
	public void velocidadVuelo() {
		System.out.println("Mucha");
	}

}
