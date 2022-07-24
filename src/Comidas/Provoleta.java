package Comidas;

public class Provoleta extends Plato{
	boolean tieneEspecias;
	
	public Provoleta(int peso, boolean tieneEspecias) {
		this.peso = peso;
		this.tieneEspecias = tieneEspecias;
		aptoVegetariano = true;
	}
	
	public boolean esEspecial() {
		return esAbundante() || this.tieneEspecias;
	}
	
	@Override
	public int getValoracion() throws Exception {
		if(esEspecial()) {
			return 120;
		}
		return 80;
	}
}
