package modelo;


/**
 * Esta clase interactua con la clase Casilla permitiendo evaluar las respuestas 
 * y definir un puntaje. Todas las casillas las agrupa por cada respuesta para que 
 * Casillas revise si es correcta la respuesta.
 *  @version: 24/11/2019
 *
 */
public class Tablero {
	
	private Casilla casilla;
	private int puntos1 = 0;
	private int puntos2 = 0;
	private int puntos3 = 0;
	private int puntos4 = 0;
	private int puntos5 = 0;
	private int puntos6 = 0;
	private int puntos7 = 0;
	private int puntos8 = 0;
	private int puntos9 = 0;
	private int puntos10 = 0;
	private int puntos;
	
		
	public Tablero () {}
	 
	/**
	 * Este metodo se encarga de recibir la respuesta 1 del jugador  
	 *  @version: 14/12/2019
	 *  @param a8, b8, c8, d8, f8, g8, i8, j8, k8, l8 son usados para entregar el valor de 
	 *  cada casilla que conforma la respuesta 1.  
	 *
	 */
	private void setRta1( String a8
					   	,String b8
						,String c8
						,String d8
						,String f8
						,String g8
						,String i8
						,String j8
						,String k8
						,String l8) {		
		casilla = new Casilla();	
		int num = 1;
		String rta1 = a8+b8+c8+d8+f8+g8+i8+j8+k8+l8;
		casilla.setRta(num,rta1);		
		this.puntos1 = casilla.getPtos();		
	}
	
	/**
	 * Este metodo se encarga de recibir la respuesta 2 del jugador  
	 *  @version: 14/12/2019
	 *  @param a12, b12, c12, d12, e12, f12, g12, h12, i12, k12, l12, m12, n12, o12, p12, q12, r12
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 2.  
	 *
	 */
	private void setRta2( String a12
						,String b12
						,String c12
						,String d12
						,String e12
						,String f12
						,String g12
						,String h12
						,String i12						
						,String k12
						,String l12
						,String m12
						,String n12
						,String o12
						,String p12
						,String q12
						,String r12
						) {		
		casilla = new Casilla();	
		int num = 2;
		String rta1 = a12+b12+c12+d12+e12+f12+g12+h12+i12+k12+l12+m12+n12+o12+p12+q12+r12;
		casilla.setRta(num,rta1);		
		this.puntos2 = casilla.getPtos();		
	}
	
	/**
	 * Este metodo se encarga de recibir la respuesta 3 del jugador  
	 *  @version: 14/12/2019
	 *  @param b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 3.  
	 *
	 */
	private void setRta3( String b2
						,String b3
						,String b4
						,String b5
						,String b6
						,String b7
						,String b8
						,String b9
						,String b10
						,String b11
						,String b12
						,String b13
						,String b14						
						,String b15											
						) {		
			casilla = new Casilla();	
			int num = 3;
			String rta1 = b2+b3+b4+b5+b6+b7+b8+b9+b10+b11+b12+b13+b14+b15;
			casilla.setRta(num,rta1);		
			this.puntos3 = casilla.getPtos();		
			}
	
	/**
	 * Este metodo se encarga de recibir la respuesta 4 del jugador  
	 *  @version: 14/12/2019
	 *  @param c17, d17, e17, f17, g17, h17, i17, j17, k17, l17, m17, n17
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 4.
	 */		
	private void setRta4( String c17
					,String d17
					,String e17
					,String f17
					,String g17
					,String h17
					,String i17	
					,String j17
					,String k17
					,String l17
					,String m17
					,String n17					
					) {		
			casilla = new Casilla();	
			int num = 4;
			String rta1 = c17+d17+e17+f17+g17+h17+i17+j17+k17+l17+m17+n17;
			casilla.setRta(num,rta1);		
			this.puntos4 = casilla.getPtos();		
}	

	/**
	 * Este metodo se encarga de recibir la respuesta 5 del jugador  
	 *  @version: 14/12/2019
	 *  @param d19, e19, f19, g19, h19, i19, j19, k19, l19, m19, n19
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 5.
	 */	
	private void setRta5( String d19
					,String e19
					,String f19
					,String g19
					,String h19
					,String i19
					,String j19
					,String k19
					,String l19
					,String m19
					,String n19					
					) {		
			casilla = new Casilla();	
			int num = 5;
			String rta1 = d19+e19+f19+g19+h19+i19+j19+k19+l19+m19+n19;
			casilla.setRta(num,rta1);		
			this.puntos5 = casilla.getPtos();		
}	

	
	/**
	 * Este metodo se encarga de recibir la respuesta 6 del jugador  
	 *  @version: 14/12/2019
	 *  @param e15, f15, g15, h15, i15, j15, k15, l15
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 6.
	 */	
	private void setRta6(String e15
					,String f15
					,String g15
					,String h15
					,String i15
					,String j15
					,String k15
					,String l15									
					) {		
			casilla = new Casilla();	
			int num = 6;
			String rta1 = e15+f15+g15+h15+i15+j15+k15+l15;
			casilla.setRta(num,rta1);		
			this.puntos6 = casilla.getPtos();		
}

	/**
	 * Este metodo se encarga de recibir la respuesta 7 del jugador  
	 *  @version: 14/12/2019
	 *  @param h4, h5, h6, h7, h9, h10, h12, h13, h14, h15, h16, h17, h18, h19
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 7.
	 */	
	private void setRta7( String h4
					,String h5
					,String h6
					,String h7
					,String h9
					,String h10
					,String h12
					,String h13
					,String h14						
					,String h15
					,String h16
					,String h17
					,String h18
					,String h19					
					) {		
	casilla = new Casilla();	
	int num = 7;
	String rta1 = h4+h5+h6+h7+h9+h10+h12+h13+h14+h15+h16+h17+h18+h19;
	casilla.setRta(num,rta1);		
	this.puntos7 = casilla.getPtos();		
}
	/**
	 * Este metodo se encarga de recibir la respuesta 8 del jugador  
	 *  @version: 14/12/2019
	 *  @param j4, k4, l4, m4, n4, o4, p4, q4, r4, s4
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 8.
	 */	
	private void setRta8( 
					 String j4						
					,String k4
					,String l4
					,String m4
					,String n4
					,String o4
					,String p4
					,String q4
					,String r4
					,String s4			
					) {		
					casilla = new Casilla();	
			int num = 8;
			String rta1 = j4+k4+l4+m4+n4+o4+p4+q4+r4+s4;
			casilla.setRta(num,rta1);		
			this.puntos8 = casilla.getPtos();		
			}
	/**
	 * Este metodo se encarga de recibir la respuesta 9 del jugador  
	 *  @version: 14/12/2019
	 *  @param n2, n4, n5, n6, n7 son usados para entregar el valor de cada 
	 *  casilla que conforma la respuesta 9.
	 */	
	private void setRta9( String n1
								,String n2
								,String n4
								,String n5
								,String n6
								,String n7																			
								) {		
					casilla = new Casilla();	
					int num = 9;
					String rta1 = n1+n2+n4+n5+n6+n7;
					casilla.setRta(num,rta1);		
					this.puntos9 = casilla.getPtos();		
					}	
	/**
	 * Este metodo se encarga de recibir la respuesta 10 del jugador  
	 *  @version: 14/12/2019
	 *  @param q4, q5, q6, q7, q8, q9, q10, q12, q13, q14, q15, q16, q17, q18, q19
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 10.
	 */	
	private void setRta10( String q3
					,String q4
					,String q5
					,String q6
					,String q7
					,String q8
					,String q9
					,String q10
					,String q12				
					,String q13
					,String q14						
					,String q15
					,String q16
					,String q17
					,String q18
					,String q19
					) {		
		casilla = new Casilla();	
		int num = 10;
		String rta1 = q3+q4+q5+q6+q7+q8+q9+q10+q12+q13+q14+q15+q16+q17+q18+q19;
		casilla.setRta(num,rta1);		
		this.puntos10 = casilla.getPtos();		
		}
	/**
	 * Este metodo se encarga agrupar el valor de cada casilla para que corresponda
	 *  a una respuesta del tablero  
	 *  @version: 14/12/2019
	 *  @param Todos los parametros de este método corresponden al valor de una casilla
	 *   en el tablero según su ubicación en él.
	 *   son usados para entregar el valor de cada casilla que conforma la respuesta 10.
	 */	
	public void encasillar (
			String c12, String  a8, String  b9, String  b2, String  l8, String  k8, String  j8, String  i8, String  g8, 
			String  f8, String  d8, String  c8, String  b8, String  b7, String  b6, String  b5, String  b4, String  b3, 
			String  b10, String b14, String  b15, String  a12, String  q3, String  d12, String  e12, String  f12, 
			String  g12, String h9, String  h10, String  b11, String  b12, String  b13, String  i12, String  h13, 
			String  k12, String l12, String m12, String  n12, String  o12, String  p12, String  q12, String  r12, 
			String  d17, String h14, String  h15, String  h16, String  h17, String  h18, String  h19, String  g19, 
			String  f19, String e19, String  d19, String i19, String  j19, String  l19, String  n19, String  g17, 
			String  f17, String e17, String  c17, String  m19, String  k19, String  i17, String  j17, String  l17, 
			String  m17, String n17, String  k17, String  l15, String k15, String  j15, String  i15, String  g15, 
			String  f15, String e15, String  q13, String  q14, String  q15, String  q16, String  q17, String  q18, 
			String  q19, String q5, String  q6, String  q7, String  q8, String  q9, String q10, String  n4, String  m4, 
			String  l4, String  k4, String  j4, String  o4, String  p4, String  r4, String  s4, String  q4, String  n1, 
			String  h7, String  h6, String  n2, String  n5, String  n6, String  n7, String  h5, String  h4, String  h12
			) {
		
		setRta1(a8,b8,c8,d8,f8,g8,i8,j8,k8,l8);
		setRta2(a12,b12,c12,d12,e12,f12,g12,h12,i12,k12,l12,m12,n12,o12,p12,q12,r12);
		setRta3(b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15);
		setRta4(c17,d17,e17,f17,g17,h17,i17,j17,k17,l17,m17,n17);
		setRta5(d19,e19,f19,g19,h19,i19,j19,k19,l19,m19,n19);
		setRta6(e15,f15,g15,h15,i15,j15,k15,l15);
		setRta7(h4,h5,h6,h7,h9,h10,h12,h13,h14,h15,h16,h17,h18,h19);
		setRta8(j4,k4,l4,m4,n4,o4,p4,q4,r4,s4);
		setRta9(n1,n2,n4,n5,n6,n7);
		setRta10(q3,q4,q5,q6,q7,q8,q9,q10,q12,q13,q14,q15,q16,q17,q18,q19);
		
	}
			
	/**
	 * Este metodo se encarga calcular y entregar el puntaje de la respuesta entregada  
	 *  @version: 24/11/2019
	 *  @return int entrega los puntos que corresponden a la pregunta contestada.
	 *
	 */
	public int entregaPtos() {
		this.puntos = this.puntos1+this.puntos2+this.puntos3+this.puntos4+this.puntos5+
					  this.puntos6+this.puntos7+this.puntos8+this.puntos9+this.puntos10;
		return puntos;	
	}

	 	
}
