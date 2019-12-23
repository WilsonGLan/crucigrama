package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import modelo.Jugador;
import modelo.Tablero;
import vista.Main;


/**
 * Esta clase permite interactuar con el usuario manejando todas las clases
 *  @version: 24/11/2019
 *
 */
public class Crucigrama {
	
	static Jugador jdr = new Jugador();
	static Tablero tbl = new Tablero();
	
	@SuppressWarnings("unused")
	private Main principal;
	
	public void SetmainApp(Main p) {
		principal = p;
	}
	
	//Nombre del jugador
	@FXML
	private TextField tbNombre;
	
	//Se declaran las casillas blancas.
	
	@FXML
	private TextField c12, a8, b9, b2, l8, k8, j8, i8, g8, f8, d8, c8, b8, b7, b6, b5, b4, b3, b10;

	@FXML
	private TextField b14, b15, a12, q3, d12, e12, f12, g12, h9, h10, b11, b12, b13, i12, h13, k12, l12;
	
	@FXML
	private TextField m12, n12, o12, p12, q12, r12, d17, h14, h15, h16, h17, h18, h19, g19, f19, e19, d19;
	
	@FXML
	private TextField i19, j19, l19, n19, g17, f17, e17, c17, m19, k19, i17, j17, l17, m17, n17, k17, l15;
	
	@FXML
	private TextField k15, j15, i15, g15, f15, e15, q13, q14, q15, q16, q17, q18, q19, q5, q6, q7, q8, q9;
	
	@FXML
	private TextField q10, n4, m4, l4, k4, j4, o4, p4, r4, s4, q4, n1, h7, h6, n2, n5, n6, n7, h5, h4, h12; 
	
	// Casillas negras
	@FXML
	private Label j12, h11, q11, h8, e8, n3;
	
	@FXML
	private Label lblPtje;
	
	// metodo de evento que recibe los valores de todos los elementos graficos que trabajan con datos.
	
	@FXML
	private void enviarDatos() {
		tbl.encasillar(
				c12.getText(), a8.getText(), b9.getText(), b2.getText(), l8.getText(), k8.getText(), 
				j8.getText(), i8.getText(), g8.getText(), f8.getText(), d8.getText(), c8.getText(), 
				b8.getText(), b7.getText(), b6.getText(), b5.getText(), b4.getText(), b3.getText(), 
				b10.getText(),b14.getText(), b15.getText(), a12.getText(), q3.getText(), d12.getText(), 
				e12.getText(), f12.getText(), g12.getText(), h9.getText(), h10.getText(), b11.getText(), 
				b12.getText(), b13.getText(), i12.getText(), h13.getText(), k12.getText(), l12.getText(),
				m12.getText(), n12.getText(), o12.getText(), p12.getText(), q12.getText(), r12.getText(), 
				d17.getText(), h14.getText(), h15.getText(), h16.getText(), h17.getText(), h18.getText(), 
				h19.getText(), g19.getText(), f19.getText(), e19.getText(), d19.getText(), i19.getText(), 
				j19.getText(), l19.getText(), n19.getText(), g17.getText(), f17.getText(), e17.getText(), 
				c17.getText(), m19.getText(), k19.getText(), i17.getText(), j17.getText(), l17.getText(), 
				m17.getText(), n17.getText(), k17.getText(), l15.getText(), k15.getText(), j15.getText(), 
				i15.getText(), g15.getText(), f15.getText(), e15.getText(), q13.getText(), q14.getText(), 
				q15.getText(), q16.getText(), q17.getText(), q18.getText(), q19.getText(), q5.getText(), 
				q6.getText(), q7.getText(), q8.getText(), q9.getText(), q10.getText(), n4.getText(), 
				m4.getText(), l4.getText(), k4.getText(), j4.getText(), o4.getText(), p4.getText(), 
				r4.getText(), s4.getText(), q4.getText(), n1.getText(), h7.getText(), h6.getText(), 
				n2.getText(), n5.getText(), n6.getText(), n7.getText(), h5.getText(), h4.getText(), 
				h12.getText()
				);				
	
		jdr.entregarPuntaje(tbNombre.getText(), tbl.entregaPtos());		
		lblPtje.setText(String.valueOf(jdr.getPuntajeJ()));		
		
	}

	
	
}
