package Comensales;

import Comidas.Plato;

public class Popular extends Comensal {
	
	public Popular(int peso) {
		this.peso = peso;
	}
	
	@Override
	boolean leAgrada(Plato plato) {
		return plato.esAbundante();
	}
}
