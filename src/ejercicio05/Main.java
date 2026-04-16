package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Poligono> listaPoligonos = new ArrayList<>();
		int opcion;

		do {
			System.out.println("\n--- MENÚ DE POLÍGONOS ---");
			System.out.println("1. Introducir triángulo.");
			System.out.println("2. Introducir rectángulo.");
			System.out.println("3. Mostrar polígonos.");
			System.out.println("0. Salir del programa.");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();

			// El Switch actúa como un centro de mando, derivando a las funciones
			switch (opcion) {
			case 1:
				introducirTriangulo(sc, listaPoligonos);
				break;
			case 2:
				introducirRectangulo(sc, listaPoligonos);
				break;
			case 3:
				mostrarPoligonos(listaPoligonos);
				break;
			case 0:
				System.out.println("Saliendo del programa. ¡Misión cumplida!");
				break;
			default:
				System.out.println("¡Opción incorrecta, recluta! Inténtalo de nuevo.");
			}

		} while (opcion != 0);

		sc.close();
	}

	// --- FUNCIONES DEL MENÚ ---

	public static void introducirTriangulo(Scanner sc, ArrayList<Poligono> lista) {
		System.out.print("Introduce la longitud del lado 1: ");
		double l1 = sc.nextDouble();
		System.out.print("Introduce la longitud del lado 2: ");
		double l2 = sc.nextDouble();
		System.out.print("Introduce la longitud del lado 3: ");
		double l3 = sc.nextDouble();

		// Creamos el objeto y lo metemos en la lista de golpe
		lista.add(new Triangulo(l1, l2, l3));
		System.out.println("-> ¡Triángulo almacenado con éxito!");
	}

	public static void introducirRectangulo(Scanner sc, ArrayList<Poligono> lista) {
		System.out.print("Introduce la longitud del lado 1 (base): ");
		double l1 = sc.nextDouble();
		System.out.print("Introduce la longitud del lado 2 (altura): ");
		double l2 = sc.nextDouble();

		lista.add(new Rectangulo(l1, l2));
		System.out.println("-> ¡Rectángulo almacenado con éxito!");
	}

	public static void mostrarPoligonos(ArrayList<Poligono> lista) {
		if (lista.isEmpty()) {
			System.out.println("-> La lista de polígonos está vacía. ¡Añade algunos primero!");
			return; // Cortamos la función aquí si no hay nada
		}

		System.out.println("\n--- DATOS DE LOS POLÍGONOS ---");
		for (Poligono p : lista) {
			// El polimorfismo en acción: cada uno usará su propio toString() y area()
			System.out.println(p.toString());
			System.out.println("Área calculada: " + p.area());
			System.out.println("--------------------------------");
		}
	}
}