package juego;

public class Juego {

	private final int FILAS_COLUMNAS = 10;
	
	public static final int ORIENTACION_VERTICAL = 100;
	public static final int ORIENTACION_HORIZONTAL = 200;
	
	
	private String[][] panel;
	
	private Barco[] barcos; 
	
	
	/**
	 * 
	 */
	public Juego() {
		
		panel = new String[FILAS_COLUMNAS][FILAS_COLUMNAS];
		
		for(int i=0;i<FILAS_COLUMNAS;i++) {
			
			for(int j=0;j<FILAS_COLUMNAS;j++) {
				
				panel[i][j] = "+";
			}
		}
		
		// creamos espacio para los barcos
		barcos = new Barco[7];

	}
	
	
	
	
	
	/**
	 * 
	 */
	public void pintarPanel() {
		
		for(int i=0;i<FILAS_COLUMNAS;i++) {
			
			for(int j=0;j<FILAS_COLUMNAS;j++) {
				
				System.out.print(panel[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	
	
	
	public void pintarBarcos() {
		
		for(int i=0;i<7;i++) {
			
			System.out.println(barcos[i]);
		}
	}	
	
	
	
	
	
	
	/**
	 * este algoritmo SIEMPRE coloca los portaviones hacia la derecha o hacia abajo
	 * 
	 * Eso lo hemos decidido nosotros y como no había nada en el enunciado en contra no 
	 * puede estar mal ya que lo estamos justificando en el código.
	 * 
	 * 
	 * @param f fila de inicio del poprtaviones
	 * @param c columna de inicio del portaviones
	 * @param orientacion HORIZONTAL o VERTICAL
	 */
	public void setPortaviones(int f,int c, int orientacion) {
		
		// pregunto si me sabe sin salirme del panel
		if((f<=FILAS_COLUMNAS-4)&&(orientacion==ORIENTACION_VERTICAL)) {
			
			// si me cabe lo coloco
			panel[f][c] = "P";
			panel[f+1][c] = "P";
			panel[f+2][c] = "P";
			panel[f+3][c] = "P";
		}
		// idem: pregunto si cabe en HORIZONTAL y si eso lo coloco
		else if((c<=FILAS_COLUMNAS-4)&&(orientacion==ORIENTACION_HORIZONTAL)) {
			
			panel[f][c] = "P";
			panel[f][c+1] = "P";
			panel[f][c+2] = "P";
			panel[f][c+3] = "P";
		}

		
		// este barco lo coloco en la posicion 0 de los barcos
		// los portaviones siempre van ahí
		Barco barco = new Barco();
		barco.setFila(f);
		barco.setColumna(c);
		barco.setOrientacion(orientacion);
		barco.setTipo("P");
		
		barcos[0] = barco;
	}
	
	
	

	
	/**
	 * este algoritmo SIEMPRE coloca el ACORAZADO hacia la derecha o hacia abajo
	 * 
	 * Eso lo hemos decidido nosotros y como no había nada en el enunciado en contra no 
	 * puede estar mal ya que lo estamos justificando en el código.
	 * 
	 * 
	 * @param f fila de inicio del ACORAZADO
	 * @param c columna de inicio del ACORAZADO
	 * @param orientacion HORIZONTAL o VERTICAL
	 */
	public void setAcorazado(int f,int c, int orientacion) {
		
		// pregunto si me sabe sin salirme del panel
		if((f<=FILAS_COLUMNAS-3)&&(orientacion==ORIENTACION_VERTICAL)) {
			
			// si me cabe lo coloco
			panel[f][c] = "A";
			panel[f+1][c] = "A";
			panel[f+2][c] = "A";
		}
		// idem: pregunto si cabe en HORIZONTAL y si eso lo coloco
		else if((c<=FILAS_COLUMNAS-3)&&(orientacion==ORIENTACION_HORIZONTAL)) {
			
			panel[f][c] = "A";
			panel[f][c+1] = "A";
			panel[f][c+2] = "A";
		}
		
		
		// este barco lo coloco en la posicion 1 de los barcos
		// los acorazados siempre van ahí
		Barco barco = new Barco();
		barco.setFila(f);
		barco.setColumna(c);
		barco.setOrientacion(orientacion);
		barco.setTipo("A");
		
		barcos[1] = barco;		

	}	
	

	
	

	
	/**
	 * este algoritmo SIEMPRE coloca el SUBMARINO hacia la derecha o hacia abajo
	 * 
	 * Eso lo hemos decidido nosotros y como no había nada en el enunciado en contra no 
	 * puede estar mal ya que lo estamos justificando en el código.
	 * 
	 * 
	 * @param f fila de inicio del SUBMARINO
	 * @param c columna de inicio del SUBMARINO
	 * @param orientacion HORIZONTAL o VERTICAL
	 */
	public void setSubmarino(int f,int c, int orientacion) {
		
		// pregunto si me sabe sin salirme del panel
		if((f<=FILAS_COLUMNAS-3)&&(orientacion==ORIENTACION_VERTICAL)) {
			
			// si me cabe lo coloco
			panel[f][c] = "S";
			panel[f+1][c] = "S";
			panel[f+2][c] = "S";
		}
		// idem: pregunto si cabe en HORIZONTAL y si eso lo coloco
		else if((c<=FILAS_COLUMNAS-3)&&(orientacion==ORIENTACION_HORIZONTAL)) {
			
			panel[f][c] = "S";
			panel[f][c+1] = "S";
			panel[f][c+2] = "S";
		}

		
		
		// este barco lo coloco en la posicion 2 de los barcos
		// los submarinos siempre van ahí
		Barco barco = new Barco();
		barco.setFila(f);
		barco.setColumna(c);
		barco.setOrientacion(orientacion);
		barco.setTipo("S");
		
		barcos[2] = barco;	
	}	
	
	

	
	/**
	 * este algoritmo SIEMPRE coloca el DESTRUCTOR hacia la derecha o hacia abajo
	 * 
	 * Eso lo hemos decidido nosotros y como no había nada en el enunciado en contra no 
	 * puede estar mal ya que lo estamos justificando en el código.
	 * 
	 * 
	 * @param f fila de inicio del DESTRUCTOR
	 * @param c columna de inicio del DESTRUCTOR
	 * @param orientacion HORIZONTAL o VERTICAL
	 */
	public void setDestructor(int f,int c, int orientacion) {
		
		// pregunto si me sabe sin salirme del panel
		if((f<=FILAS_COLUMNAS-2)&&(orientacion==ORIENTACION_VERTICAL)) {
			
			// si me cabe lo coloco
			panel[f][c] = "D";
			panel[f+1][c] = "D";
		}
		// idem: pregunto si cabe en HORIZONTAL y si eso lo coloco
		else if((c<=FILAS_COLUMNAS-2)&&(orientacion==ORIENTACION_HORIZONTAL)) {
			
			panel[f][c] = "D";
			panel[f][c+1] = "D";
		}
		
		
		
		// este barco lo coloco en la posicion 3 o 4 de los barcos
		// los destructores siempre van ahí
		Barco barco = new Barco();
		barco.setFila(f);
		barco.setColumna(c);
		barco.setOrientacion(orientacion);
		barco.setTipo("D");
		
		// si no hay ningun barco en esa carilla habrá NULL
		if(barcos[3]==null) {
			
			barcos[3] = barco;
		}
		// y si hay un barco entonces es que va en la 4
		else barcos[4] = barco;

	}		
	
	
	
	
	

	
	/**
	 * este algoritmo SIEMPRE coloca la LANCHA hacia la derecha o hacia abajo
	 * 
	 * Eso lo hemos decidido nosotros y como no había nada en el enunciado en contra no 
	 * puede estar mal ya que lo estamos justificando en el código.
	 * 
	 * 
	 * @param f fila de inicio de la LANCHA
	 * @param c columna de inicio de la LANCHA
	 * @param orientacion HORIZONTAL o VERTICAL
	 */
	public void setLancha(int f,int c) {
		
		// pregunto si me sabe sin salirme del panel
		if((f<=FILAS_COLUMNAS-1)&&(c<=FILAS_COLUMNAS-1)) {
			
			// si me cabe lo coloco
			panel[f][c] = "L";
		}

		// este barco lo coloco en la posicion 3 o 4 de los barcos
		// los destructores siempre van ahí
		Barco barco = new Barco();
		barco.setFila(f);
		barco.setColumna(c);
		barco.setOrientacion(0);
		barco.setTipo("L");
		
		// si no hay ningun barco en esa casilla habrá NULL
		if(barcos[5]==null) {
			
			barcos[5] = barco;
		}
		// y si hay un barco entonces es que va en la 6
		else barcos[6] = barco;
		
		
	}		
	
}
