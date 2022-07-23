package Comidas;

public class Parrillada extends Plato{
	int calidad;
	
	public Parrillada(Asado asado, Vacio vacio, MatambreDeCerdo matambreDeCerdo) {
		peso = asado.peso + vacio.peso + matambreDeCerdo.peso;
		valoracion = 15;
	}
}
