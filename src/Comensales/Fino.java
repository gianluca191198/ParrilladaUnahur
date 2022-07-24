package Comensales;

import Comidas.Plato;

public class Fino extends Comensal{
	
	public Fino(int peso) {
		this.peso = peso;
	}
	
	@Override
	boolean leAgrada(Plato plato) {
		boolean pesoIdeal = false;
		if (plato.getPeso() >= 150) {
			if(plato.getPeso() <= 300) {
				pesoIdeal = true;
			}
		}
		boolean agrada = false;
		try {
			agrada = pesoIdeal && (plato.getValoracion() >= 100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  agrada;
	}
	
	@Override
	boolean estaSatisfecho(){
		int pesoComidas = 0;
		boolean esPar = platosComidos.size() % 2 == 0;
		
		return pesoComidas >= (peso*0.01) && esPar;
	}

}
