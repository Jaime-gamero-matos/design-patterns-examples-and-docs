package builder;


import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		Persona persona1 = new Persona.Builder()
				.DNI("1231231321")
				.Edad(25)
				.Nombre("Pepe")
				.build();
		System.out.println(persona1.toString());
	}

}
