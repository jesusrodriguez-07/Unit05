package principal;

public class Vacio extends Exception {
	
	private static final long serialVersionUID = 2L;
	
	public Vacio() {
		super("Error. La lista no contiene valores");
	}
}
