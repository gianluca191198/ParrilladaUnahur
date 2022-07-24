package Comidas;

public class Hamburguesa extends Plato {
	
	Pan pan;
	
	public Hamburguesa(Pan pan) {
		peso= 250;
		aptoVegetariano = false;
		this.pan = pan;
		valoracion = 60 + pan.valoracion;
	}
}
