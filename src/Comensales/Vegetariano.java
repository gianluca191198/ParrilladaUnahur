package Comensales;

import Comidas.Plato;

public class Vegetariano extends Comensal {
	
	public Vegetariano(int peso) {
		this.peso = peso;
	}
	
	@Override
	boolean leAgrada(Plato plato) {
		boolean agrada = false;
		try {
			agrada = plato.esAptoVegetariano() && (plato.getValoracion() > 80);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return agrada;
	}
	
	@Override
	boolean estaSatisfecho(){
		int pesoComidas = 0;
		boolean comidasAbundantes = false;
		for(Plato plato: platosComidos) {
			pesoComidas += plato.getPeso();
			if(!comidasAbundantes) {
				comidasAbundantes = plato.esAbundante();				
			}
		}
		
		return pesoComidas >= (peso*0.01) && comidasAbundantes;
	}
}
