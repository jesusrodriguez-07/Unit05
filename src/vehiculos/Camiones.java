package vehiculos;

public class Camiones extends Vehiculos{
private double pesoMax;
private boolean mercanciaP;

public double getPesoMax() {
	return pesoMax;
}
public void setPesoMax(double pesoMax) {
	this.pesoMax = pesoMax;
}
public boolean isMercanciaP() {
	return mercanciaP;
}
public void setMercanciaP(boolean mercanciaP) {
	this.mercanciaP = mercanciaP;
}
public Camiones(String marca, String modelo, String color, String matricula, double pesoMax, boolean mercanciaP) {
	super(marca, modelo, color, matricula);
	this.setPesoMax(pesoMax);
	this.setMercanciaP(mercanciaP);
}



}
