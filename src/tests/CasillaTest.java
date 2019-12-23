package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.Casilla;
/**
 * Esta clase se utiliza para hacer pruebas JUnit con la clase Casilla * 
 *@author WILSON GUTIERREZ
 */

class CasillaTest {
	Casilla casilla = new Casilla();
	String rta1 = "glorieta";
	
	/**
	 * Estos dos metodos se utilizan para validar que puntos se obtienen al ingresar una respuesta 
	 *@author WILSON GUTIERREZ
	 */
	@Test
	void punto() {		
		casilla.setRta(6,"glorieta");
		System.out.println("PUNTOS: "+casilla.getPtos());
	}
	@Test
	void validaRtatest () {		
		casilla.setRta(6,"glorieta");		
		assertEquals(casilla.getPtos(),1);
		
	}
}
