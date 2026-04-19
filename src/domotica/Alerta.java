package domotica;

public interface Alerta {
	void activarAlerta(String mensaje) throws DispositivoApagadoException;
	void desactivarAlerta() throws DispositivoApagadoException;
	boolean isAlertaActiva();
}
