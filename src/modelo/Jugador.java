package modelo;
/**
	 * Esta clase permite obtener el nombre del jugador y su puntaje total  
	 *  @version: 24/11/2019
	 *
	 */
public class Jugador {

	private String nombreJ;
	int puntajeJ = 0;
	
	public Jugador() {}
	
	
	/**
	 * Este metodo publico le entrega a la clase los datos de jugador y puntaje.  
	 *  @version: 24/11/2019
	 *  @param j contiene el valor del nombre del jugador
	 *  @param b contiene el valor de los puntos del jugador
	 */
	public void entregarPuntaje (String j, int b){		
		setNombreJ(j);
		setPuntajeJ(b);			
	}
	
	
	/**
	 * Este metodo entrega el puntaje acumulado del jugador.  
	 *  @version: 24/11/2019
	 *  @return puntajeJ el puntaje acumulado
	 */
	public int getPuntajeJ() {
		return this.puntajeJ;
	}

	/**
	 * Este metodo calcula el puntaje que el jugador recibe por la respuesta.  
	 * @version: 24/11/2019
	 * @param puntajeJ entrega el punto de la respuesta 
	 */
	public void setPuntajeJ(int puntajeJ) {	
		this.puntajeJ = 10 * puntajeJ;
	}

	
	/**
	 * Este metodo entrega el nombre del jugador.  
	 *  @version: 24/11/2019
	 *  @return nombreJ nombre del jugador
	 */
	public String getNombreJ() {
		return this.nombreJ;
	}

	
	/**
	 * Este metodo obtiene el nombre del jugador entregado por el usuario.  
	 *  @version: 24/11/2019
	 *  @param nombreJ nombre del jugador digitado en el sistema. 
	 */
	public void setNombreJ(String nombreJ) {
		this.nombreJ = nombreJ;
	}
	
	
	
}
