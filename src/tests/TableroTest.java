package tests;
//import static org.junit.jupiter.api.Assertions.*;
//package org.junit.jupiter.api does not exist
import org.junit.Test;
import modelo.Tablero;



/**
 * Se han cambiado los metodos de la clase Tablero por lo tanto las pruebas realizadas de la 
 * segunda entrega ya no son funcionales con esta clase.
 *
 */
class TableroTest {

	Tablero tab = new Tablero();
	@Test
	void testptos() {
		//tab.setEnvioPrgta(1,"respuesta1");		
		System.out.println("PUNTOS: "+tab.entregaPtos());
	}

}
