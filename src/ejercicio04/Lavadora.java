package ejercicio04;

public class Lavadora extends Electrodomestico {
	private double carga = 5.0;
	
	public double getCarga() {
		return carga;
	}
	
	public void setCarga(double carga) {
		this.carga = carga;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = 5.0;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.setCarga(carga);
	}
	
	@Override
	public double precioFinal() {
		double precioLavadora = super.precioFinal();
		if (this.carga > 30) {
			precioLavadora += 50;
		}
		return precioLavadora;
	}

}


//SUBCLASE: Television  extends  Electrodomestico
//Atributos propios:
//- resolucion      : int     (por defecto 20 pulgadas)
//- sintonizadorTDT : boolean (por defecto false)
//
//Constructores:
//1. Television(precioBase, peso)
// - resolucion y sintonizadorTDT por defecto
//2. Television(resolucion, sintonizadorTDT, precioBase, color, consumoEnergetico, peso)
// - llama a super(precioBase, color, consumoEnergetico, peso)
//
//Métodos:
//- precioFinal(): llama a super.precioFinal()
//  si resolucion > 40  entonces precio * 1.30  (+30%)
//  si sintonizadorTDT  entonces +50 €
//- getters / setters de resolucion y sintonizadorTDT
//
//
//CLASE EJECUTABLE: Main
//- Crea una List<Electrodomestico> con distintos tipos de objetos
//- Recorre la lista, llama a precioFinal() e imprime el precio por objeto
//- Acumula totales: totalGeneral, totalLavadoras, totalTelevision
//(usa instanceof para clasificar cada objeto)
//- Muestra los tres totales al final
