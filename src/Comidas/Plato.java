package Comidas;

public abstract class Plato {

	protected int peso;
	protected int valoracion;
	protected boolean aptoVegetariano;
	
	public boolean esAbundante() {
		return getPeso() > 250;
	}
	
	public int getValoracion() throws Exception {
		return this.valoracion;
	}

	public int getPeso() {
		return peso;
	}
	
	public boolean esAptoVegetariano() {
		return aptoVegetariano;
	}
}
