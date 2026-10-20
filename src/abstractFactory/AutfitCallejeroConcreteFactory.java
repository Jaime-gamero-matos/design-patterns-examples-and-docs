package abstractFactory;

public class AutfitCallejeroConcreteFactory implements AutfitAbstractFactory{

	
	public AutfitCallejeroConcreteFactory() {
		super();
	}

	@Override
	public PantalonesAnchos createPantalon() {
		return new PantalonesAnchos();
	}

	@Override
	public CamisetaXXL createCamiseta() {
		return new CamisetaXXL();
	}

	@Override
	public ZapatillasDeBaloncesto createZapatillas() {
		return new ZapatillasDeBaloncesto();
	}

}
