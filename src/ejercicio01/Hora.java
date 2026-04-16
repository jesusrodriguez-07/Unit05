package ejercicio01;

public class Hora {

	private int horas;
	private int minutos;

	public int getHoras() {
		return horas;
	}

	public boolean setHoras(int horas) {
		boolean exito = false;
		if (horas < 24 && horas >= 0) {
			this.horas = horas;
			exito = true;
		} else {
			System.out.println("Introduce un valor valido");
		}
		return exito;

	}

	public int getMinutos() {
		return minutos;
	}

	public boolean setMinutos(int minutos) {
		boolean exito = false;
		if (minutos < 60 && minutos >= 0) {
			this.minutos = minutos;
			exito = true;
		} else {
			System.out.println("Introduce un valor valido");
		}
		return exito;

	}

	public Hora(int horas, int minutos) {
		super();
		this.setHoras(horas);
		this.setMinutos(minutos);
	}

	void inc() {
		this.minutos++;
		if (this.minutos == 60) {
			this.minutos = 0;
			this.horas = horas + 1;
		}
		if (this.horas == 24) {
			this.horas = 0;
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d", horas, minutos);
	}

}
