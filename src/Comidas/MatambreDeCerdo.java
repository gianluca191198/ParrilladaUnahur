package Comidas;

public class MatambreDeCerdo extends Corte{
	
	public MatambreDeCerdo(int cantidad) {
		this.cantidad = cantidad;
		calidad = 1;
		peso = 1350 * cantidad;
	}
}
