package socios;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio[] socios = new Socio[5];
		
		socios[0] = new Socio(1,"Pedro",25);
		socios[1] = new Socio(3,"Alberto",28);
		socios[2] = new Socio(5,"Jose",45);
		socios[3] = new Socio(2,"Jesus",35);
		socios[4] = new Socio(4,"Roberto",22);

		System.out.println("VALORES DESORDENADOS");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Arrays.sort(socios);
		
		System.out.println("VALORES ORDENADOS POR ID");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}

}
