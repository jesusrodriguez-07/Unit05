package ejercicio01;

public class HoraExacta extends Hora {
	private int segundos;

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean exito = false;
		if (segundos < 60 && segundos >= 0 ) {
			this.segundos = segundos;	
			exito = true;
		} else {
			System.out.println("Introduce un valor valido para los segundos");
		}
		return exito;
	}
	

	public HoraExacta(int horas, int minutos, int segundos) {
		super(horas, minutos);
		this.setSegundos(segundos);
	}
	
	@Override
	public void inc() {
		this.segundos++;
		if (this.segundos == 60) {
			this.segundos = 0;
			super.inc();
		}
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", this.getHoras(), this.getMinutos(), this.segundos);
	}

	
}
