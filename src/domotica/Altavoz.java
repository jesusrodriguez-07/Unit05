package domotica;

public class Altavoz extends Productos implements Nivel{
	private String nombreAsistente;
	private int nVolumen;
	
	public String getNombreAsistente() {
		return nombreAsistente;
	}
	public void setNombreAsistente(String nombreAsistente) {
		this.nombreAsistente = nombreAsistente;
	}
	public int getnVolumen() {
		return nVolumen;
	}
	

	
	public Altavoz(String nombreComercial, String marca, double precio, String nombreAsistente) {
		super(nombreComercial, marca, precio);
		this.setNombreAsistente(nombreAsistente);
		this.nVolumen = 30;
	}
	
	public void subirNivel() throws DispositivoApagadoException {
		if (this.encendido == false) {
			throw new DispositivoApagadoException();
		} else {
			this.nVolumen += 5;	
			
			if (this.nVolumen >= 100) {
				this.nVolumen = 100;
			}
		}
	}
	
	public void bajarNivel() throws DispositivoApagadoException {
		if (this.encendido == false) {
			throw new DispositivoApagadoException();
		} else {
			this.nVolumen -= 5;
			
			if (this.nVolumen <= 0) {
				this.nVolumen = 0;
			}
		}
	}
	@Override
	public String toString() {
		return "Altavoz [" + ", nombreComercial=" 
				+ nombreComercial + ", marca=" + marca + ", precio=" + precio + ", encendido=" + encendido + "nombreAsistente=" + nombreAsistente + ", nVolumen=" + nVolumen + "]";
	}
}
