package facade;


import org.junit.jupiter.api.Test;

class FacadeTest {

	@Test
	void test() {
		FacadeTiposDePersonas fachadaRegistroDePersonas = new FacadeTiposDePersonas();
		fachadaRegistroDePersonas.mostrarAtributosPolicia("Vanessa");
		fachadaRegistroDePersonas.mostrarAtributosProgramador("Nachotalarga");
	}

}
