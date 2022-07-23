package Comidas;

public class HamburguesaVegetariana extends Plato{

	Pan pan;
	
	public HamburguesaVegetariana(Pan pan, String ingrediente ) {
		peso = 250;
		esAptoVegetariano = true;
		this.pan = pan;
		valoracion = 60 + pan.valoracion + ((ingrediente.length() + 1) * 2); //  TODO:revisar el +1 y si lo tengo que hacer metodo
	}
}
