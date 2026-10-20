package factoryMethod;

public class CreadorMercedes extends Creador{

	@Override
	protected Coche factoryMethod() {
		// TODO Auto-generated method stub
		return new Mercedes();
	}
	
}
