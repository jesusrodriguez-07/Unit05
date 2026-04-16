package ejercicio04;

public class Electrodomestico {
	// ATRIBUTOS
	protected double precioBase = 100.0;
	protected String color = "blanco";
	protected char consumoEnergetico = 'F';
	protected double peso = 5.0;

	// GETTER Y SETTERS
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		} else {
			this.precioBase = 100.0;
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.comprobarColor(color);
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.comprobarConsumoEnergetico(consumoEnergetico);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			this.peso = 5.0;
		}

	}

	// CONSTRUCTORES
	public Electrodomestico(double precioBase, double peso) {
		this.setPrecioBase(precioBase);
		this.setPeso(peso);
		this.color = "blanco";
		this.consumoEnergetico = 'F';
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.setPrecioBase(precioBase);
		this.setColor(color);
		this.setConsumoEnergetico(consumoEnergetico);
		this.setPeso(peso);
	}

	// COMPROBACIONES DE VALORES
	private void comprobarConsumoEnergetico(char consumoEnergetico) {
		if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D'
				|| consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = 'F';
		}
	}

	private void comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			this.color = color.toLowerCase();
		} else {
			this.color = "blanco";
		}
	}
	
	
	// METODO 
	public double precioFinal() {
		double precioCalculado = this.precioBase;
		
		switch (this.consumoEnergetico) {
		case 'A': precioCalculado += 100; break;
		case 'B': precioCalculado += 80; break;
		case 'C': precioCalculado += 60; break;
		case 'D': precioCalculado += 50; break;
		case 'E': precioCalculado += 30; break;
		case 'F': precioCalculado += 10; break;
		}
		if (peso >= 0 && peso <= 19) {
			precioCalculado += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioCalculado += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioCalculado += 80;
		} else if (peso >= 80) {
			precioCalculado += 100;
		}
		
		
		return precioCalculado;
	}
}
//SUBCLASE: Lavadora  extends  Electrodomestico
//Atributos propios:
//- carga: double (por defecto 5.0 kg)
//
//Constructores:
//1. Lavadora(precioBase, peso)
//     carga, color y consumoEnergetico por defecto
//2. Lavadora(carga, precioBase, color, consumoEnergetico, peso)
//     llama a super(precioBase, color, consumoEnergetico, peso)
//
//Métodos:
//- precioFinal(): llama a super.precioFinal(); si carga > 30 kg entonces +50 €
//- getter / setter de carga
//
//
//SUBCLASE: Television  extends  Electrodomestico
//Atributos propios:
//- resolucion      : int     (por defecto 20 pulgadas)
//- sintonizadorTDT : boolean (por defecto false)
//
//Constructores:
//1. Television(precioBase, peso)
//   - resolucion y sintonizadorTDT por defecto
//2. Television(resolucion, sintonizadorTDT, precioBase, color, consumoEnergetico, peso)
//   - llama a super(precioBase, color, consumoEnergetico, peso)
//
//Métodos:
//- precioFinal(): llama a super.precioFinal()
//    si resolucion > 40  entonces precio * 1.30  (+30%)
//    si sintonizadorTDT  entonces +50 €
//- getters / setters de resolucion y sintonizadorTDT
//
//
//CLASE EJECUTABLE: Main
//- Crea una List<Electrodomestico> con distintos tipos de objetos
//- Recorre la lista, llama a precioFinal() e imprime el precio por objeto
//- Acumula totales: totalGeneral, totalLavadoras, totalTelevision
//(usa instanceof para clasificar cada objeto)
//- Muestra los tres totales al final

