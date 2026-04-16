package ejercicio05;

public class Triangulo extends Poligono {
	private double lado1;
	private double lado2;
	private double lado3;

	// Constructor por defecto (Lados a 1)
	public Triangulo() {
		super(3); // Un triángulo siempre tiene 3 lados
		this.lado1 = 1.0;
		this.lado2 = 1.0;
		this.lado3 = 1.0;
	}

	// Constructor con parámetros
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	// Getters y Setters
	public double getLado1() { return lado1; }
	public void setLado1(double lado1) { this.lado1 = lado1; }
	public double getLado2() { return lado2; }
	public void setLado2(double lado2) { this.lado2 = lado2; }
	public double getLado3() { return lado3; }
	public void setLado3(double lado3) { this.lado3 = lado3; }

	// Implementamos la Fórmula de Herón
	@Override
	public double area() {
		double s = (this.lado1 + this.lado2 + this.lado3) / 2.0;
		return Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
	}

	@Override
	public String toString() {
		return "Tipo: Triángulo. Lado 1: " + lado1 + ", Lado 2: " + lado2 + ", Lado 3: " + lado3 + ". " + super.toString();
	}
}