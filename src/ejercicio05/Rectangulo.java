package ejercicio05;

public class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;

	// Constructor por defecto (Lados a 1)
	public Rectangulo() {
		super(4); // Un rectángulo siempre tiene 4 lados
		this.lado1 = 1.0;
		this.lado2 = 1.0;
	}

	// Constructor con parámetros
	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	// Getters y Setters
	public double getLado1() { return lado1; }
	public void setLado1(double lado1) { this.lado1 = lado1; }
	public double getLado2() { return lado2; }
	public void setLado2(double lado2) { this.lado2 = lado2; }

	// Implementamos el método abstracto del padre
	@Override
	public double area() {
		return this.lado1 * this.lado2; // Base * Altura
	}

	@Override
	public String toString() {
		return "Tipo: Rectángulo. Lado 1: " + lado1 + ", Lado 2: " + lado2 + ". " + super.toString();
	}
}