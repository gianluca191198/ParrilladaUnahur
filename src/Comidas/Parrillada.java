package Comidas;

import java.util.List;

public class Parrillada extends Plato{
	int calidad;
	List<Corte> cortes;
	
	public Parrillada(List<Corte> cortes) {
		this.cortes = cortes;
		for(Corte corte : cortes) {
			peso += corte.peso;
		}
		aptoVegetariano = false;
	}
	
	@Override
	public int getValoracion() throws Exception {
		int calidadMaxima = 0;
		int cantidadTotal = 0;
		
		for(Corte corte : this.cortes) {
			if(calidadMaxima < corte.calidad) {
				calidadMaxima = corte.calidad;				
			}
		}
		
		int valoracion = (15 * calidadMaxima) - cortes.size();
		
		if(valoracion < 0) {
			throw new Exception("Error en la valoracion");
		}
		return valoracion;
	}
	
}
