package adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdaptadorTest {

	@Test
	void test() {
		DatosPago miPago = new DatosPago("23221", 170.33);
		
		PasarelaDePagoAntigua pasarelaAntigua = new PasarelaDePagoAntigua();
		
		ProcesadorPagosActual procesadorAdaptado = new AdaptadorPasarelaPagos(pasarelaAntigua);
		
		procesadorAdaptado.procesarPago(miPago);
	}

}
