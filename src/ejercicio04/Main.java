package ejercicio04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> lista = new ArrayList<>();
		lista.add(new Electrodomestico(200, 15));
		lista.add(new Lavadora(150, "rojo", 'B', 45, 10));
		lista.add(new Television(400, 10));
		lista.add(new Television(300, "negro", 'C', 20, 50, true));
		lista.add(new Lavadora(300, 35));

		double totalElectrodomesticos = 0;
		double totalLavadoras = 0;
		double totalTelevisiones = 0;

		for (Electrodomestico electrodomestico : lista) {

			double precio = electrodomestico.precioFinal();

			System.out.println("Precio de este artículo: " + precio + "€");

			totalElectrodomesticos += precio;
			
			if (electrodomestico instanceof Lavadora) {
				totalLavadoras += precio;
			} else if (electrodomestico instanceof Television) {
				totalTelevisiones += precio;
			}
		}
		
		
		System.out.println("-------PRECIO DE LOS PRODUCTOS--------");
		System.out.println("Precio total de las lavadoras: " + totalLavadoras + "€");
		System.out.println("Precio total de las televisiones: " + totalTelevisiones + "€");
		System.out.println("Precio total de los electrodomesticos: " + totalElectrodomesticos + "€");
	}
	// CLASE EJECUTABLE: Main
	// - Crea una List<Electrodomestico> con distintos tipos de objetos
	// - Recorre la lista, llama a precioFinal() e imprime el precio por objeto
	// - Acumula totales: totalGeneral, totalLavadoras, totalTelevision
	// (usa instanceof para clasificar cada objeto)
	// - Muestra los tres totales al final

}
