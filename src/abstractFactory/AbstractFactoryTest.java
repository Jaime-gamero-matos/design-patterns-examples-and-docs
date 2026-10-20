package abstractFactory;


import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

	@Test
	void test() {
		AutfitAbstractFactory autfitCallejeroFactory = new AutfitCallejeroConcreteFactory();
		AbstractCamiseta camisetaXXL = autfitCallejeroFactory.createCamiseta();
		AbstractPantalones pantalonesAnchos = autfitCallejeroFactory.createPantalon();
		AbstractZapatillas zapatillasBasket = autfitCallejeroFactory.createZapatillas();
		camisetaXXL.vestir();
		pantalonesAnchos.vestir();
		zapatillasBasket.vestir();
	}

}
