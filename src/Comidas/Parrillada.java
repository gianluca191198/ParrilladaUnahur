package Comidas;

public class Parrillada extends Plato{
	int calidad;
	Asado asado;
	Vacio vacio;
	MatambreDeCerdo matambreDeCerdo; 
	
	public Parrillada(Asado asado, Vacio vacio, MatambreDeCerdo matambreDeCerdo) {
		peso = asado.peso + vacio.peso + matambreDeCerdo.peso;
		this.asado = asado;
		this.vacio = vacio;
		this.matambreDeCerdo = matambreDeCerdo;
	}
	
	@Override
	public int getValoracion() throws Exception {
		int calidadMaxima;
		
		if(this.vacio.cantidad > 0) {
			calidadMaxima = this.vacio.calidad;
		}else if(this.asado.cantidad > 0) {
			calidadMaxima = this.asado.calidad;
		}else {
			calidadMaxima = this.matambreDeCerdo.calidad;
		} 
		
		calidadMaxima = (15 * calidadMaxima) - (this.vacio.cantidad + this.asado.cantidad + this.matambreDeCerdo.cantidad);
		
		if(calidadMaxima < 0) {
			throw new Exception("Error en la valoracion");
		}
		return calidadMaxima;
	}
	
}
