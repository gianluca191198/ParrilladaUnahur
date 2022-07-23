package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Comidas.*;

class ComidasTest {

	@Test
	void ValoracionDeParrilladaDeAsadoVacioYMatambre() throws Exception {
		Parrillada parrillada = new Parrillada(new Asado(1), new Vacio(1), new MatambreDeCerdo(1));
		assertEquals(parrillada.getValoracion(), 42);
	}
	
	@Test
	void ValoracionDeParrilladaTresDeCadaCorte() throws Exception {
		Parrillada parrillada = new Parrillada(new Asado(3), new Vacio(3), new MatambreDeCerdo(3));
		assertEquals(parrillada.getValoracion(), 36);
	}
	
	@Test
	void ValoracionDeParrilladaMenorACero() throws Exception {
		Parrillada parrillada = new Parrillada(new Asado(20), new Vacio(20), new MatambreDeCerdo(20));
		assertThrows(Exception.class, () -> parrillada.getValoracion());
	}
	
	@Test
	void valoracionDeTodasLasComidas() throws Exception {
		Parrillada parrillada = new Parrillada(new Asado(1), new Vacio(1), new MatambreDeCerdo(1));
		Hamburguesa hamburguesa = new Hamburguesa(new PanIndustrial());
		HamburguesaVegetariana hamburguesaVegetariana = new HamburguesaVegetariana(new PanCasero(), "Garbanzos");
		Provoleta provoleta = new Provoleta(250, true);
		Plato plato[] = {parrillada, hamburguesa, hamburguesaVegetariana, provoleta};
		
		assertEquals(plato[0].getValoracion(), 42);
		assertEquals(plato[1].getValoracion(), 60);
		assertEquals(plato[2].getValoracion(), 97);
		assertEquals(plato[3].getValoracion(), 120);
	}

}
