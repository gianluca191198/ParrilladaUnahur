package Comensales;

import java.util.List;

import Comidas.Plato;

public abstract class Comensal {
	int peso;
	List<Plato> platosComidos;
	
	boolean estaSatisfecho(){
		int pesoComidas = 0;
		for(Plato plato: platosComidos) {
			pesoComidas += plato.getPeso();
		}
		
		return pesoComidas > (peso*0.01);
	}
	
	boolean leAgrada(Plato plato) {
		return true;
	}
	
	void comer(Plato plato) {
		platosComidos.add(plato);
	}

}
