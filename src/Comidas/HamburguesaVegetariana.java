package Comidas;

public class HamburguesaVegetariana extends Plato{

	Pan pan;
	String ingrediente;
	
	public HamburguesaVegetariana(Pan pan, String ingrediente ) {
		peso = 250;
		esAptoVegetariano = true;
		this.pan = pan;
		this.ingrediente = ingrediente;
	}
	
	@Override
	public int getValoracion() throws Exception {
		int valoracionFinal;
		int plus = (ingrediente.length()) * 2;
		
		if(plus > 17) {
			plus = 17;
		}
		
		valoracionFinal = 60 + pan.valoracion + plus;
		return valoracionFinal;
	}
}
