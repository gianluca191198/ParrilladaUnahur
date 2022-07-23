package Comidas;

public class Asado extends Corte{
	
	public Asado(int cantidad) {
		this.cantidad = cantidad;
		calidad = 2;
		peso = 800 * cantidad;
	}
}
