package vehiculos;


import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String marca;
		String modelo;
		String color;
		String matricula;
		int nPlaza;
//		double pesoMax;
//		boolean mercanciaP;
//		int cilindrada;
		int opcion;
		
		ArrayList <Vehiculos> Garaje = new ArrayList<>();
		
		do {
			System.out.println("1. Crear un turismo");
			System.out.println("2. Crear un camion");
			System.out.println("3. Crear una moto");
			System.out.println("4. Mostrar vehiculos");
			System.out.println("5. Conducir un vehiculo");	
			opcion = sc.nextInt();
			sc.nextLine();
		switch (opcion) {
		case 1:
			System.out.println("Construye tu vehiculo mi compi");
			System.out.println("Introduce la marca del vehiculo");
			marca = sc.nextLine();
			System.out.println("Introduce el modelo del vehiculo");
			modelo = sc.nextLine();
			System.out.println("Introduce el color del vehiculo");
			color = sc.nextLine();
			System.out.println("Introduce la matricula del turismo");
			matricula = sc.nextLine();
			System.out.println("Introduce el numeor de plazas del turismo");
			nPlaza = sc.nextInt();
			Turismos t1 = new Turismos(marca, modelo, color, matricula, nPlaza, true);
			Garaje.add(t1);
			break;
			
		case 2:
			//si
			break;
			
		case 3:
			// no
			break;
		case 4:
			for (Vehiculos vehiculos : Garaje) {
				System.out.print("Matricula: " + vehiculos.getMatricula() + "Marca: " +  vehiculos.getMarca() + "Modelo: " + vehiculos.getModelo() + "Color: " + vehiculos.getColor());
				if (vehiculos instanceof Turismos) {
					Turismos cocheOculto = (Turismos) vehiculos;
					System.out.println("Nº Plazas: " + cocheOculto.getnPlaza());
				}
			}
			break;
		case 5:
			if (Garaje.isEmpty()) {
				System.out.println("Maquina, el garaje esta vacio. Primero introduce algun cochecito");
			} else {
				System.out.println("Introduce la matricula del coche con el que quieres trabajar");
				String matriculaBuscada = sc.nextLine();
				
				boolean encontrado = false;
				
				for (Vehiculos vehiculos : Garaje) {
					
				
					if (vehiculos.getMatricula().equals(matriculaBuscada)) {
						encontrado = true; // ¡Bingo!
						System.out.println("\n¡Vehículo localizado! Subiendo al " + vehiculos.getMarca() + " " + vehiculos.getModelo() + "...");
						vehiculos.Arrancar();
						System.out.println("Motor arrancado");
						
						System.out.println("A que velocidad quiere ir");
						int velocidadObjetivo = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Iniciando simulacion de conduccion.");
						vehiculos.cambiarVelocidad(velocidadObjetivo);
						break;
						
					}
				}
				
				if (encontrado == false) {
					System.out.println("Vehiculo con esa matricula no haber aqui");
				}
			}
		}
		
		} while (opcion != 8);
		
				
		sc.close();
	}
}
