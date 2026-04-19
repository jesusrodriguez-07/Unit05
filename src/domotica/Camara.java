package domotica;

public class Camara extends Productos implements Alerta{
	private int resolucion;
	private boolean grabando;
	private boolean alerta;
	private String mensajeAlerta;
	
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isGrabando() {
		return grabando;
	}
	public void setGrabando(boolean grabando) {
		this.grabando = grabando;
	}
	public boolean isAlerta() {
		return alerta;
	}
	public void setAlerta(boolean alerta) {
		this.alerta = alerta;
	}
	public Camara(String nombreComercial, String marca, double precio, int resolucion) {
		super(nombreComercial, marca, precio);
		this.setResolucion(resolucion);
	}
	
	public void iniciarGrabacion() throws DispositivoApagadoException {
		if (this.encendido == false) {
			throw new DispositivoApagadoException();
		} else {
			this.grabando = true;
		}
	}
	
	public void dejarGrabacion() {
		this.grabando = false;
	}
	
	public void activarAlerta(String mensaje) throws DispositivoApagadoException {
		if (this.encendido == false) {
			throw new DispositivoApagadoException();
		} else {
			this.alerta = true;
			System.out.println(mensaje);
			this.mensajeAlerta = mensaje;
		}
		
	}

	public void desactivarAlerta() throws DispositivoApagadoException{
		if (this.encendido == false) {
			throw new DispositivoApagadoException();
		} else {
			this.alerta = false;
		}
		
	}

	public boolean isAlertaActiva() {
		boolean isActiva = false;
		if (this.alerta == true) {
			isActiva = true;
		} else {
			isActiva = false;
		}
		
		return isActiva;
	}
	@Override
	public String toString() {
		return "Camara [resolucion=" + resolucion + ", grabando=" + grabando + ", mensajeAlerta=" + mensajeAlerta
				+ ", nombreComercial=" + nombreComercial + ", marca=" + marca + ", precio=" + precio + ", encendido="
				+ encendido + "]";
	}
	
}
