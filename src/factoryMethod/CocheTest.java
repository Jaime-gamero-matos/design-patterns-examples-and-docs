package factoryMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocheTest {

	@Test
	void test() {
		CreadorMercedes creadorMercedes = new CreadorMercedes();
		CreadorFord creadorFord = new CreadorFord();
		Coche mercedes = creadorMercedes.factoryMethod();
		Coche ford = creadorFord.factoryMethod();
		mercedes.mostrarMarca();
		ford.mostrarMarca();
		Coche mercedes2 = creadorMercedes.factoryMethod();
		mercedes2.mostrarMarca();
	}

}
