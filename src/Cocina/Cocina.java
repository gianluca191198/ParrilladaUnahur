package Cocina;

import java.util.List;
import java.util.Random;

import Comensales.Comensal;
import Comidas.*;

public class Cocina {
	
	List<Plato> comidasPreparadas;
	
	public Cocina(List<Plato> comidasPreparadas) {
		this.comidasPreparadas = comidasPreparadas;
	}
	
	boolean tieneBuenaOfertaVegetariana() {
		int vegetariano = 0;
		int noVegetariano = 0;
		
		for(Plato plato: comidasPreparadas) {
			if(plato.esAptoVegetariano()) {
				vegetariano++;
			}else {
				noVegetariano++;
			}
		}
		
		return noVegetariano - vegetariano >= 2;
	}
	
	Plato obtenerPlatoFuerteCarnivoro() throws Exception {
		Plato platofuerte = null;
		for(Plato plato: comidasPreparadas) {
			if(platofuerte == null) {
				platofuerte = plato;
				continue;
			}
			if(!plato.esAptoVegetariano()) {
				if(platofuerte.getValoracion() < plato.getValoracion()) {
					platofuerte = plato;
				}
			}
		}
		return platofuerte;
	}
	
	List<Plato> platosRecomendados(Comensal comensal){
		List<Plato> platos = List.of();
		for(Plato plato: comidasPreparadas) {
			if(comensal.leAgrada(plato)) {
				platos.add(plato);
			}
		}		
		return platos;
		
	}
	
	Plato elegirPlatoParaComensal(Comensal comensal) {
		Random aleatorio = new Random();
		List<Plato> platos = platosRecomendados(comensal);				
        
		return platos.get(aleatorio.nextInt(platos.size()));
	}
	
	
	
}
