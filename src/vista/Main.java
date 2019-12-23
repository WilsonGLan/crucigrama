package vista;

import controlador.Crucigrama;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


/**
 * Esta clase permite cargar los elementos gráficos o visuales para interactuar con el usuario
 * @version 14/12/2019
 */
public class Main extends Application {
	
	private Stage escenario;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		escenario = primaryStage;
		FXMLLoader cargar = new FXMLLoader(Main.class.getResource("/controlador/tblrVisual.fxml"));
		
		try {
			VBox panel = (VBox) cargar.load();
			Scene escena = new Scene(panel);
			escenario.setScene(escena);
			escenario.show();
			
			Crucigrama control = cargar.getController();
			control.SetmainApp(this);
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		 }
  
	public static void main(String[] args) {
		Application.launch(args);
	}
}
