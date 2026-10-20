package facade;

public abstract class Persona {
	private String nombre, puestoDeTrabajo, puntoFuerte;

	public Persona(String nombre, String puestoDeTrabajo, String puntoFuerte) {
		super();
		this.nombre = nombre;
		this.puestoDeTrabajo = puestoDeTrabajo;
		this.puntoFuerte = puntoFuerte;
	}

	public void mostrarAtributos() {
		System.out.println("me llamo " + this.nombre +  " soy un " + this.puestoDeTrabajo + " y mi punto fuerte es " + this.puntoFuerte);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuestoDeTrabajo() {
		return puestoDeTrabajo;
	}

	public void setPuestoDeTrabajo(String puestoDeTrabajo) {
		this.puestoDeTrabajo = puestoDeTrabajo;
	}

	public String getPuntoFuerte() {
		return puntoFuerte;
	}

	public void setPuntoFuerte(String puntoFuerte) {
		this.puntoFuerte = puntoFuerte;
	}
	
	
}
