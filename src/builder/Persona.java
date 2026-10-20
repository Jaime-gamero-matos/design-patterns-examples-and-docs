package builder;

public class Persona {
	private String nombre;
	private final String DNI;
	private int edad;
	
	public Persona(String nombre, String dNI, int edad) {
		this.nombre = nombre;
		DNI = dNI;
		this.edad = edad;
	}
	
	public Persona(Builder builder) {
		this.nombre = builder.nombre;
		DNI = builder.DNI;
		this.edad = builder.edad;
	}
	

	


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + "]";
	}





	public static class Builder {	
		private String nombre;
		private String DNI;
		private int edad;
		
		
		public Persona.Builder Nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		public Persona.Builder DNI(String dNI) {
			DNI = dNI;
			return this;
		}
		public Persona.Builder Edad(int edad) {
			this.edad = edad;
			return this;
		}
		
		
		public Persona build() {
			return new Persona(this);
		}
		
	}
}