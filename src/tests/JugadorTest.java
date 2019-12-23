package tests;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.Jugador;

class JugadorTest {

	Jugador jug = new Jugador(); 
	@Test
	void puntajeTest() {
		int i = 0;
		while (i<=9) {
			jug.setPuntajeJ(1);
			System.out.println("sumando puntaje: "+jug.getPuntajeJ());
			i++;
		}		
		
	}

}
