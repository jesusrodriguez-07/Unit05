package ejercicio03;

public class Perecedero extends Productos{
	private int diasCaducar;

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		if (diasCaducar>0) {
			this.diasCaducar = diasCaducar;	
		}
	}

	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.setDiasCaducar(diasCaducar);
	}

	@Override
	public String toString() {
		return super.toString() + " Dias a caducar [" + diasCaducar + "]";
	}
	
	public double calcular(int cantidad) {
		double precioNuevo = super.calcular(cantidad);
		
		if (diasCaducar == 1) {
			precioNuevo = precioNuevo/4;
		} else if (diasCaducar == 2) {
			precioNuevo = precioNuevo/3;
		} else if (diasCaducar == 3) {
			precioNuevo = precioNuevo/2;
		}
		
		return precioNuevo;
	}
}
