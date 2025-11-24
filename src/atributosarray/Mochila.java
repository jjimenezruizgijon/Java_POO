package atributosarray;

public class Mochila {
	
	String color;
	String[] bolillos;
	public Mochila(String color) {
		super();
		this.color = color;
		this.bolillos = new String[5];
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String[] getBolillos() {
		return bolillos;
	}
	public void setBolillos(String[] bolillos) {
		this.bolillos = bolillos;
	}
	
	public void guardarCosas(int bolsillo, String cosa) {
		this.bolillos[bolsillo] = cosa;
	}
	
	public void enseñarMochila() {
		System.out.println("Mi mochila es de color: " + this.color + "\n");
		
		for (int i = 0; i < bolillos.length; i++) {
			System.out.println("En el bolsillo: " + i + " tengo: " + bolillos[i]);
		}
		
		
	}

}
