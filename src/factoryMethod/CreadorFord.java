package factoryMethod;

public class CreadorFord extends Creador{

	@Override
	protected Coche factoryMethod() {
		return new Ford();
	}

}
