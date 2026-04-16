package ejercicio04;

public class Television extends Electrodomestico {
	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.setResolucion(resolucion);
		this.setSintonizadorTDT(sintonizadorTDT);
	}
	
	public double precioFinal() {
		double precioTelevision = super.precioFinal();
		if (this.resolucion > 40) {
			precioTelevision *= 1.30;
		}
		if (this.sintonizadorTDT) {
			precioTelevision += 50;
		}
		
		return precioTelevision;
	}
}


//CLASE EJECUTABLE: Main
//- Crea una List<Electrodomestico> con distintos tipos de objetos
//- Recorre la lista, llama a precioFinal() e imprime el precio por objeto
//- Acumula totales: totalGeneral, totalLavadoras, totalTelevision
//(usa instanceof para clasificar cada objeto)
//- Muestra los tres totales al final
