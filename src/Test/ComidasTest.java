package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import Comidas.*;

class ComidasTest {

	@Test
	void valoracionDeHamburguesaDeCarneConPanCasero() throws Exception {
		Hamburguesa hamburguesa = new Hamburguesa(new PanCasero());
		assertEquals(hamburguesa.getValoracion(), 80);
	}

	@Test
	void valoracionDeHamburguesaDeCarneConPanMasaMadre() throws Exception {
		HamburguesaVegetariana hamburguesaVegetariana = new HamburguesaVegetariana(new PanMasaMadre(), "Garbanzos");
		assertEquals(hamburguesaVegetariana.getValoracion(), 122);
	}

	@Test
	void valoracionProvoleta() {
		Provoleta provoleta = new Provoleta(190, true);
		assertEquals(provoleta.esEspecial(), true);
	}

	@Test
	void valoracionDeParrilladaDeAsadoEntrañaYChorizo() throws Exception {
		List<Corte> lista = Arrays.asList(new Corte("Asado", 10, 250), new Corte("Entraña", 7, 200), new Corte("Chorizo", 8, 50));
		Parrillada parrillada = new Parrillada(lista);
		
		assertEquals(parrillada.getValoracion(), 147);
	}

}
