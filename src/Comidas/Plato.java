package Comidas;

public abstract class Plato {

	protected double peso;
	protected int valoracion;
	protected boolean esAptoVegetariano;
	
	boolean esAbundante() {
		return peso > 250;
	}
}
