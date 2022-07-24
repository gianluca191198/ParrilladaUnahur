package Comensales;

import java.util.ArrayList;

import Comidas.Plato;

public class Popular extends Comensal {
	
	public Popular(int peso) {
		this.peso = peso;
		this.platosComidos =  new ArrayList<Plato>();
	}
	
	@Override
	public boolean leAgrada(Plato plato) {
		return plato.esAbundante();
	}
}
