package orientacionobjetos;

public class Termostato {
	
	private double temperaturaActual;
	private double temperaturaObjetivo;
	private boolean encendido;
	
	public Termostato (double temperaturaObjetivo) {
		this.temperaturaActual = 0;
		this.temperaturaObjetivo = temperaturaObjetivo;
		this.encendido = false;
	}
	
	public void encender() {
		this.encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}
	
	public void comprobarTemp () {
		if (encendido == false) {
			System.out.println("Enciende el dispositivo primero");
		} else {
			System.out.println("La temperatura de la habitacion es: " + temperaturaActual);
		}
	}
	
	public double getTemperaturaObjetivo() {
		return temperaturaObjetivo;
	}
	public void setTemperaturaObjetivo(double temperaturaObjetivo) {
		this.temperaturaObjetivo = temperaturaObjetivo;
	}
	public double getTemperaturaActual() {
		return temperaturaActual;
	}
	
	
}
