package socios;

public class Socio implements Comparable<Socio>{
	private int id;
	private String nombre;
	private int edad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad >= 0 && edad <= 116) {
			this.edad = edad;	
		} else {
			System.out.println("Introduce un valor valido");
		}
	}
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.setEdad(edad);
	}
	@Override
	public String toString() {
		return "Socio [ID=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public int compareTo(Socio otroSocio) {
		// Como queremos ordenar de MENOR a MAYOR por ID, hacemos una simple resta:
				// - Si mi ID es 10 y el suyo es 20 -> 10 - 20 = -10 (Negativo: yo voy ANTES)
				// - Si mi ID es 30 y el suyo es 20 -> 30 - 20 =  10 (Positivo: yo voy DESPUÉS)
				// - Si ambos somos 20 -> 20 - 20 = 0 (Somos iguales, nos quedamos donde estamos)
		return this.id - otroSocio.id;
	}
}
