package ejercicio03;

public class Productos {
	private String nombre;
	private double precio;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if (precio>0) {
			this.precio = precio;	
		}
	}
	public Productos(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.setPrecio(precio);
	}
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public double calcular(int productos) {
		return (this.getPrecio() * productos);
	}
}
