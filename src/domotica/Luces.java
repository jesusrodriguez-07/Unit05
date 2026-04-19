package domotica;

public class Luces extends Productos implements Nivel{
	private String color;
	private int nBrillo;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getnBrillo() {
		return nBrillo;
	}
	public void setnBrillo(int nBrillo) {
		this.nBrillo = nBrillo;
	}
	public Luces(String nombreComercial, String marca, double precio, String color) {
		super(nombreComercial, marca, precio);
		this.setColor(color);
		this.nBrillo = 50;
	}
	
	public void subirNivel() throws DispositivoApagadoException{
		if (this.encendido == false) {
			throw new DispositivoApagadoException();
		} else {
			this.nBrillo += 10;
			
			if (this.nBrillo >= 100) {
				this.nBrillo = 100;
			}
		}
	}
	
	public void bajarNivel() throws DispositivoApagadoException {
		if (this.encendido == false) {
			throw new DispositivoApagadoException();
		} else {
			this.nBrillo -= 10;
			
			if (this.nBrillo <= 0) {
				this.nBrillo = 0;
			}
		}
	}
	@Override
	public String toString() {
		return "Luces [nombreComercial=" + nombreComercial + ", marca="
				+ marca + ", precio=" + precio + ", encendido=" + encendido +  "color=" + color +  "nBrillo=" + nBrillo + "]";
	}
	
	
}
