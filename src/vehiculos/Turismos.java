package vehiculos;

public class Turismos extends Vehiculos {
private int nPlaza;
private boolean tipoUsoM;


public int getnPlaza() {
	return nPlaza;
}


public void setnPlaza(int nPlaza) {
	this.nPlaza = nPlaza;
}


public boolean isTipoUsoM() {
	return tipoUsoM;
}


public void setTipoUsoM(boolean tipoUsoM) {
	this.tipoUsoM = tipoUsoM;
}


public Turismos(String marca, String modelo, String color, String matricula, int nPlaza, boolean tipoUsoM) {
	super(marca, modelo, color, matricula);
	this.setnPlaza(nPlaza);
	this.setTipoUsoM(tipoUsoM);
}

}
