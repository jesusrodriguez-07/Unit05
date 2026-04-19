package vehiculos;

public class Motocicletas extends Vehiculos{
private int cilindrada;

public int getCilindrada() {
	return cilindrada;
}

public void setCilindrada(int cilindrada) {
	this.cilindrada = cilindrada;
}

public Motocicletas(String marca, String modelo, String color, String matricula, int cilindrada) {
	super(marca, modelo, color, matricula);
	this.setCilindrada(cilindrada);
}

public boolean carnetRequerido() {
	boolean carnet = false;
	if (this.getCilindrada() >= 125) {
		carnet = true;
	}
	return carnet;
}
}
