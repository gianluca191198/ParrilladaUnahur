package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import Comensales.Fino;
import Comensales.Popular;
import Comensales.Vegetariano;
import Comidas.*;

class ComensalesTest {

	@Test
	void vegetarianoEstaSatisfechoConProvoletaYHamburguesaVegetariana() throws Exception {
		Vegetariano comensal = new Vegetariano(68500);
		Provoleta provoleta = new Provoleta(190, true);
		HamburguesaVegetariana hamburguesa1 = new HamburguesaVegetariana(new PanMasaMadre(), "Garbanzos");
		HamburguesaVegetariana hamburguesa2 = new HamburguesaVegetariana(new PanMasaMadre(), "Garbanzos");
		
		comensal.comer(provoleta);
		comensal.comer(hamburguesa1);
		comensal.comer(hamburguesa2);
		
		assertEquals(false, provoleta.esAbundante());
		assertEquals(false, hamburguesa1.esAbundante());
		assertEquals(false, hamburguesa2.esAbundante());
		
		assertEquals(true, comensal.estaSatisfecho());
	}
	
	@Test
	void comensalPopularNoEstaSatisfechoConParrilladaDeAsadoEntrañaYChorizo() throws Exception {
		Popular comensal = new Popular(68500);
		
		List<Corte> lista = Arrays.asList(new Corte("Asado", 10, 250), new Corte("Entraña", 7, 200), new Corte("Chorizo", 8, 50));
		Parrillada parrillada = new Parrillada(lista);
		
		comensal.comer(parrillada);

		
		assertEquals(false, comensal.estaSatisfecho());
	}
	
	@Test
	void ComensalFinoLeAgradaHamburguesaConMasaMadre() throws Exception {
		Fino comensal = new Fino(68500);
		Hamburguesa hamburguesa = new Hamburguesa(new PanMasaMadre());
		
		assertEquals(true, comensal.leAgrada(hamburguesa));
	}
	
	@Test
	void ComensalFinoNoLeAgradaHamburguesaConPanCasero() throws Exception {
		Fino comensal = new Fino(68500);
		Hamburguesa hamburguesa = new Hamburguesa(new PanCasero());
		
		assertEquals(false, comensal.leAgrada(hamburguesa));
	}

}
