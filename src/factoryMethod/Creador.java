package factoryMethod;

public abstract class Creador {
	Coche coche;
	protected abstract Coche factoryMethod();
	public Coche getCoche() {
		return coche;
	}
}
