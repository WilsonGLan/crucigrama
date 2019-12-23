package modelo;


/**
	 * Esta clase permite evaluar las respuestas indicadas por el jugador  
	 *  @version: 24/11/2019
	 *
	 */

public class Casilla {

	private int puntos = 0;
	private int npta;
	private String rtaJ;
	
	public Casilla () {}
	
	/**
	 * Metodo público que permite trabajar con las respuestas entregadas
	 * @param n: contiene el número de la respuesta recibida
	 * @param r: contiene la respuesta recibida.
	 *
	 */
	public void setRta(int n, String r) {
		this.npta = n;
		this.rtaJ = r;
		
		validarRta();
	}
	
	/**
	 * Metodo encargado de verificar que la respuesta sea correcta y entregar un punto 
	 * o cero puntos en caso de que no sea correcta
	 * @return sin retorno
	 *
	 */
	private void validarRta() {
		
		switch(npta) {
		  case 1:
			if(rtaJ.equalsIgnoreCase("cedaelpaso"))
				 puntos = 1;
			else puntos = 0;
		    break;
		  case 2:
			  if(rtaJ.equalsIgnoreCase("prohibidoparquear"))
					 puntos = 1;
				else puntos = 0;
		    break;
		  case 3:
			  if(rtaJ.equalsIgnoreCase("reglamentarias"))
					 puntos = 1;
				else puntos = 0;
			    break;
		  case 4:
			  if(rtaJ.equalsIgnoreCase("informativas"))
					 puntos = 1;
				else puntos = 0;
			    break;
		  case 5:
			  if(rtaJ.equalsIgnoreCase("preventivas"))
					 puntos = 1;
				else puntos = 0;
			    break;
		  case 6:
			  if(rtaJ.equalsIgnoreCase("glorieta"))
					 puntos = 1;
				else puntos = 0;
			    break;
		  case 7:
			  if(rtaJ.equalsIgnoreCase("zonadederrumbe"))
					 puntos = 1;
				else puntos = 0;
			    break;
		  case 8:
			  if(rtaJ.equalsIgnoreCase("aeropuerto"))
					 puntos = 1;
				else puntos = 0;
			    break;
		  case 9:
			  if(rtaJ.equalsIgnoreCase("nopase"))
					 puntos = 1;
				else puntos = 0;
			    break;			    
		  case 10:
			  if(rtaJ.equalsIgnoreCase("primerosauxilios"))
					 puntos = 1;
				else puntos = 0;
			    break;
		  default:
		    
		}		
		
	}
	
	/**
	 * Este metodo se encarga de entregar en la clase Tablero el punto obtenido por la respuesta.
	 *@return puntos entrega 1 o 0 según si es correcta o no.
	 */
	public int getPtos () {			
		return puntos;	
		}
		
	
}
