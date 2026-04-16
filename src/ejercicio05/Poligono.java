package ejercicio05;

public abstract class Poligono {
	// Atributo protegido (indicado por el '#' en el UML)
	protected int numeroLados;

	// Constructor
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	// Getter
	public int getNumeroLados() {
		return numeroLados;
	}

	// Método abstracto: No tiene cuerpo aquí, obligamos a los hijos a programarlo
	public abstract double area();

	// toString personalizado
	@Override
	public String toString() {
		return "Número de lados: " + this.numeroLados;
	}
}