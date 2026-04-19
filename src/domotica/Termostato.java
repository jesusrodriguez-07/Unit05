package domotica;

public class Termostato extends Productos implements Alerta{
private int temperatura;
private boolean funcionamiento;
private boolean alerta;
private String mensajeAlerta;

public int getTemperatura() {
	return temperatura;
}
public void setTemperatura(int temperatura) {
	this.temperatura = temperatura;
}
public boolean isFuncionamiento() {
	return funcionamiento;
}
public void setFuncionamiento(boolean funcionamiento) {
	this.funcionamiento = funcionamiento;
}
public boolean isAlerta() {
	return alerta;
}
public void setAlerta(boolean alerta) {
	this.alerta = alerta;
}
public Termostato(String nombreComercial, String marca, double precio, int temperatura) {
	super(nombreComercial, marca, precio);
	this.setTemperatura(temperatura);
}

public void cambiarFuncion() {
	if (this.funcionamiento == true) {
		this.funcionamiento = false;	
	} else {
		this.funcionamiento = true;
	}
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
	return "Termostato [temperatura=" + temperatura + ", funcionamiento=" + funcionamiento + ", alerta=" + mensajeAlerta
			+ ", nombreComercial=" + nombreComercial + ", marca=" + marca + ", precio=" + precio + ", encendido="
			+ encendido + "]";
}



}
