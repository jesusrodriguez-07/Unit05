package ejercicio02;

public class Empleado {
	private String nombre;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado(String nombre) {
		this.setNombre(nombre);
	}
	
	@Override
	public String toString() {
		return "Empleado: " + nombre;
	}
}
