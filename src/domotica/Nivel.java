package domotica;

public interface Nivel {
	void subirNivel() throws DispositivoApagadoException;
	void bajarNivel() throws DispositivoApagadoException;
}
