package facade;

public class FacadeTiposDePersonas {
	//digamos que en nuestro programa podemos registrar diferentes tipos de personas
	
	public void mostrarAtributosPolicia(String nombre) {
		new Policia(nombre).mostrarAtributos();
	}
	
	public void mostrarAtributosProgramador(String nombre) {
		new Programador(nombre).mostrarAtributos();
	}
}
