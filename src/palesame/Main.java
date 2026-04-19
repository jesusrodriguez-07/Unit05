package palesame;

import java.util.ArrayList;
import java.util.Scanner;
import domotica.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Productos> catalogo = new ArrayList<>();
		int opcionPrincipal = -1;

		System.out.println("🏠 INICIANDO SISTEMA DOMÓTICO...");

		// BUCLE 1: MENÚ PRINCIPAL
		while (opcionPrincipal != 6) {
			System.out.println("\n--- CUARTEL GENERAL (MENÚ PRINCIPAL) ---");
			System.out.println("1. Añadir Altavoz");
			System.out.println("2. Añadir Luces");
			System.out.println("3. Añadir Termostato");
			System.out.println("4. Añadir Cámara");
			System.out.println("5. Seleccionar dispositivo y operar (Submenú)");
			System.out.println("6. Salir del sistema");
			System.out.print("Elige una opción: ");
			
			try {
				opcionPrincipal = Integer.parseInt(sc.nextLine());

				switch (opcionPrincipal) {
				case 1:
					catalogo.add(new Altavoz("Echo", "Amazon", 50, "Alexa"));
					System.out.println("Altavoz de serie añadido al catálogo.");
					break;
				case 2:
					catalogo.add(new Luces("Hue", "Philips", 30, "Blanco"));
					System.out.println("Luces de serie añadidas al catálogo.");
					break;
				case 3:
					catalogo.add(new Termostato("Nest", "Google", 120, 22));
					System.out.println("Termostato de serie añadido al catálogo.");
					break;
				case 4:
					catalogo.add(new Camara("C200", "Tapo", 40, 1080));
					System.out.println("Cámara de serie añadida al catálogo.");
					break;
				case 5:
					operarDispositivo(catalogo, sc); // Llamamos al submenú
					break;
				case 6:
					System.out.println("Apagando sistema central. ¡Adiós!");
					break;
				default:
					System.out.println("Opción incorrecta.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Debes introducir un número.");
			}
		}
		sc.close();
	}

	// =========================================================================
	// MÉTODO DEL SUBMENÚ: Selecciona un dispositivo y entra en su bucle de acciones
	// =========================================================================
	private static void operarDispositivo(ArrayList<Productos> catalogo, Scanner sc) {
		// Comprobamos si hay dispositivos usando tu excepción personalizada
		try {
			if (catalogo.isEmpty()) {
				throw new Vacio();
			}
		} catch (Vacio e) {
			System.out.println("Esta vacío");
			return; // Volvemos al menú principal
		}

		// Listamos los dispositivos
		System.out.println("\n--- CATÁLOGO DE TROPAS ---");
		for (int i = 0; i < catalogo.size(); i++) {
			System.out.println(i + ". " + catalogo.get(i).getNombreComercial() + " (" + catalogo.get(i).getClass().getSimpleName() + ")");
		}

		System.out.print("Selecciona el ID del dispositivo a controlar: ");
		int id = Integer.parseInt(sc.nextLine());

		if (id >= 0 && id < catalogo.size()) {
			Productos p = catalogo.get(id);
			int opcionSubmenu = -1;

			// BUCLE 2: SUBMENÚ ESPECÍFICO DEL DISPOSITIVO
			while (opcionSubmenu != 0) {
				System.out.println("\n--- PANEL DE CONTROL: " + p.getNombreComercial() + " ---");
				System.out.println("Estado actual: " + (p.isEncendido() ? "ENCENDIDO" : "APAGADO"));
				System.out.println("1. Encender dispositivo");
				System.out.println("2. Apagar dispositivo");
				System.out.println("3. Ver informe completo (toString)");

				// Opciones exclusivas según la clase (Polimorfismo e instanceof)
				if (p instanceof Altavoz) {
					System.out.println("4. Subir Volumen (+5)");
					System.out.println("5. Bajar Volumen (-5)");
				} else if (p instanceof Luces) {
					System.out.println("4. Subir Brillo (+10)");
					System.out.println("5. Bajar Brillo (-10)");
				} else if (p instanceof Termostato) {
					System.out.println("4. Cambiar Función (Frío/Calor)");
					System.out.println("5. Activar Alerta");
					System.out.println("6. Desactivar Alerta");
				} else if (p instanceof Camara) {
					System.out.println("4. Iniciar Grabación");
					System.out.println("5. Detener Grabación");
					System.out.println("6. Activar Alerta");
					System.out.println("7. Desactivar Alerta");
				}

				System.out.println("0. VOLVER AL MENÚ PRINCIPAL");
				System.out.print("Orden: ");
				opcionSubmenu = Integer.parseInt(sc.nextLine());

				// Bloque try-catch para capturar los errores de dispositivo apagado
				try {
					switch (opcionSubmenu) {
					case 0:
						System.out.println("Saliendo del panel de control...");
						break;
					case 1:
						p.encender(); System.out.println("Dispositivo encendido.");
						break;
					case 2:
						p.apagar(); System.out.println("Dispositivo apagado.");
						break;
					case 3:
						System.out.println(p.toString());
						break;
					
					// CASOS ESPECÍFICOS: Hacemos el cast según el tipo para usar los métodos
					case 4:
						if (p instanceof Altavoz) { ((Altavoz) p).subirNivel(); System.out.println("Volumen subido."); }
						else if (p instanceof Luces) { ((Luces) p).subirNivel(); System.out.println("Brillo subido."); }
						else if (p instanceof Termostato) { ((Termostato) p).cambiarFuncion(); System.out.println("Función cambiada."); }
						else if (p instanceof Camara) { ((Camara) p).iniciarGrabacion(); System.out.println("Grabando..."); }
						break;
						
					case 5:
						if (p instanceof Altavoz) { ((Altavoz) p).bajarNivel(); System.out.println("Volumen bajado."); }
						else if (p instanceof Luces) { ((Luces) p).bajarNivel(); System.out.println("Brillo bajado."); }
						else if (p instanceof Termostato) { 
							System.out.print("Mensaje de alerta: "); 
							((Termostato) p).activarAlerta(sc.nextLine()); 
						}
						else if (p instanceof Camara) { ((Camara) p).dejarGrabacion(); System.out.println("Grabación detenida."); }
						break;
						
					case 6:
						if (p instanceof Termostato) { ((Termostato) p).desactivarAlerta(); System.out.println("Alerta desactivada."); }
						else if (p instanceof Camara) { 
							System.out.print("Mensaje de alerta: "); 
							((Camara) p).activarAlerta(sc.nextLine()); 
						}
						break;
						
					case 7:
						if (p instanceof Camara) { ((Camara) p).desactivarAlerta(); System.out.println("Alerta desactivada."); }
						break;
					}
				} catch (DispositivoApagadoException e) {
					// ¡Aquí es donde estalla la granada si intentas usar algo apagado!
					System.out.println("ERROR TÁCTICO: " + e.getMessage());
				}
			}
		} else {
			System.out.println("ID no válido.");
		}
	}
}
