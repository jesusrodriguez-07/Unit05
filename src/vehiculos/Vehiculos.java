package vehiculos;

public class Vehiculos {
	protected String marca;
	protected String modelo;
	protected String color;
	protected String matricula;
	protected boolean encendidoM;
	protected int marchaActual;
	protected int velocidadActual;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
			if (comprobarMatricula(matricula)) {
				this.matricula=matricula;
			} else System.out.println("Matricula incorrecta");
		}
	
	public boolean isEncendidoM() {
		return encendidoM;
	}
	public void setEncendidoM(boolean encendidoM) {
		this.encendidoM=encendidoM;
	}
	
	public String getEncendidoTexto() {
		String encendidoTexto = "apagado"; 
		if (encendidoM == true) {
			encendidoTexto = "encendido";
		} else if (encendidoM == false) {
			encendidoTexto = "apagado";
		}
		return encendidoTexto;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	private static boolean comprobarMatricula(String matricula) {
		boolean matriculaCorrecta = false;
		
		if (matricula == null || matricula.length() != 7) {
			matriculaCorrecta = false;
		} else {
			String matriculaMayusc = matricula.toUpperCase();
	
			if (matriculaMayusc.matches("[0-9]{4}[A-Z]{3}")) {
				matriculaCorrecta = true;	
				}
		}
		return matriculaCorrecta;
	}
	
	
	public Vehiculos(String marca, String modelo, String color, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.setMatricula(matricula);
		
		//valores por defecto de la clase 
		this.setEncendidoM(false);
		this.marchaActual = 0;
		this.velocidadActual = 0;
	}
	
	
	public void Apagar() {
		this.setEncendidoM(false);
	}
	
	public void Parar() {
		this.velocidadActual = 0;
		this.marchaActual = 0;
		this.Apagar();
	}
	
	public void Arrancar() {
		this.setEncendidoM(true);
		this.marchaActual=1;
	}
	
	public void subirMarcha() {
		this.marchaActual++;
	}
	
	public void bajarMarcha() {
		this.marchaActual--;
	}
	
	public int cambiarVelocidad(int velocidadFinal) {
		int velocidadMaxPorMarcha = velocidadMarcha(this.velocidadActual);
		if ((velocidadFinal- this.velocidadActual) > 0) {
			System.out.println("Acelerando hasta: " + velocidadFinal);
			if ( velocidadFinal > velocidadMaxPorMarcha) {
				System.out.println("Tienes que cambiar de marcha para seguir acelerando");
				velocidadFinal = velocidadMaxPorMarcha;
			} else if (velocidadFinal <= velocidadMaxPorMarcha) {
				System.out.println("Has acelerado hasta: " + velocidadFinal);
			}
			
		}
		return velocidadFinal;
	}
	
	public int velocidadMarcha(int velocidadFinal) {
		int velocidadMax = 0;
		
		if (this.isEncendidoM()) {
				if (this.marchaActual == 1) {
				System.out.println("La velocidad solo llegará hasta 30km por hora en 1 marcha");
					velocidadMax = 30;
				} 
				if (this.marchaActual == 2) {
					System.out.println("La velocidad llegará hasta 50km por hora en 2 marcha");
					velocidadMax = 50;
				} if (this.marchaActual == 3) {
					System.out.println("La velocidad llegará hasta 70km por hora en 3 marcha");
					velocidadMax = 70;
				} if (this.marchaActual == 4) {
					System.out.println("La velocidad llegará hasta 100km por hora en 4 marcha");
					velocidadMax = 100;
				} if (this.marchaActual == 5) {
					System.out.println("La velocidad llegará hasta más de 100km por hora en 5 marcha");
					velocidadMax = 300;
				}
			} else {
			System.out.println("Primero enciende el coche");
			}
		
		
		return velocidadMax;
	}
}
