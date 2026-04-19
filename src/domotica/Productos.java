package domotica;

import java.util.Objects;

public class Productos implements Comparable<Productos>{
	protected String nombreComercial;
	protected String marca;
	protected double precio;
	protected boolean encendido;

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void encender() {
		this.encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}
	
	public Productos(String nombreComercial, String marca, double precio) {
		this.nombreComercial = nombreComercial;
		this.marca = marca;
		this.precio = precio;
		this.encendido = false;
	}
	
	public int compareTo (Productos otro) {
		return Double.compare(precio, otro.precio);
	}

	@Override
	public String toString() {
		return "Productos [nombreComercial=" + nombreComercial + ", marca=" + marca + ", precio=" + precio + ", encendido="
				+ encendido + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, nombreComercial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Productos other = (Productos) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(nombreComercial, other.nombreComercial);
	}
	
	

}
