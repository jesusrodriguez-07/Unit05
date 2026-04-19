package domotica;

public class DispositivoApagadoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public DispositivoApagadoException() {
		super("Error: el dispositivo está apagado");
	}
}
