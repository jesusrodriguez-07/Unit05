package futbol;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista>{
	private int nCamiseta;
	private String nombre;
	private int edad;
	private int nGoles;
	
	public Futbolista(int nCamiseta, String nombre, int edad, int nGoles) {
		super();
		this.nCamiseta = nCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.nGoles = nGoles;
	}

	@Override
	public String toString() {
		return "Futbolista [nCamiseta=" + nCamiseta + ", nombre=" + nombre + ", edad=" + edad + ", nGoles=" + nGoles
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return  nCamiseta == other.nCamiseta && Objects.equals(nombre, other.nombre);
	}
	
	public int compareTo(Futbolista otroFutbolista) {
		int resultado = this.nCamiseta - otroFutbolista.nCamiseta;
		if (resultado == 0) {
			resultado = this.nombre.compareTo(otroFutbolista.nombre);
		}
		return resultado;
	}
}
