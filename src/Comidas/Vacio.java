package Comidas;

public class Vacio extends Corte{
	
	public Vacio(int cantidad) {
		this.cantidad = cantidad;
		calidad = 3;
		peso = 1200 * cantidad;
	}
}
