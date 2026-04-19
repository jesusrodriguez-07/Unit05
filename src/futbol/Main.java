package futbol;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Futbolista[] lista = new Futbolista[5];
		
		lista[0] = new Futbolista(12, "Pepelu", 40, 45);
		lista[1] = new Futbolista(12, "Pepelu", 17, 34);
		lista[2] = new Futbolista(10, "Pepelu", 21, 24);
		lista[3] = new Futbolista(1, "Juan", 33, 12);
		lista[4] = new Futbolista(3, "Juan", 23, 26);
		
		System.out.println("Desordenados");
		for (Futbolista futbolista : lista) {
			System.out.println(futbolista);
		}
		
		System.out.println("");
		System.out.println();
		
		Arrays.sort(lista);
		
		System.out.println("Ordenados");
		for (Futbolista futbolista : lista) {
			System.out.println(futbolista);
		}
	}
}
