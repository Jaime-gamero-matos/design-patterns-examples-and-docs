package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConexionBDDTest {

	@Test
	void test() {
		ConexionBDD conexionBdd = ConexionBDD.getInstancia();
		ConexionBDD conexionBdd2 = ConexionBDD.getInstancia();
		
	}

}
