package juego;

public class Juego {

	public static final int FILAS_COLUMNAS = 10;
	
	public static final int ORIENTACION_VERTICAL = 100;
	public static final int ORIENTACION_HORIZONTAL = 200;
	
	
	public static final char BARCOS_PORTAVIONES = 'P';
	public static final char BARCOS_ACORAZADO = 'A';
	public static final char BARCOS_SUBMARINO = 'S';
	public static final char BARCOS_DESTRUCTOR = 'D';
	public static final char BARCOS_LANCHA = 'L';
	

	public static final int DISPARO_AGUA = -1;
	public static final int DISPARO_TOCADO = 0;
	public static final int DISPARO_HUNDIDO_PORTAVIONES = 1;
	public static final int DISPARO_HUNDIDO_ACORAZADO = 2;
	public static final int DISPARO_HUNDIDO_SUBMARINO = 3;
	public static final int DISPARO_HUNDIDO_DESTRUCTOR = 4;
	public static final int DISPARO_HUNDIDO_LANCHA = 5;
	public static final int DISPARO_HUNDIDO_TODOS = 10;
	
	
	private char[][] panel;
	
	private Barco[] barcos; 
	
	
	/**
	 * 
	 */
	public Juego() {
		
		panel = new char[FILAS_COLUMNAS][FILAS_COLUMNAS];
		
		for(int i=0;i<FILAS_COLUMNAS;i++) {
			
			for(int j=0;j<FILAS_COLUMNAS;j++) {
				
				panel[i][j] = '+';
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
	
	

	
	
	
	
	public void setBarco(int f,int c, int orientacion,char tipoBarco) {
		
		int longitudBarco = 0;
		switch(tipoBarco) {
			
			case 'P': longitudBarco=4; break; 
			case 'A': longitudBarco=3; break; 
			case 'S': longitudBarco=3; break; 
			case 'D': longitudBarco=2; break; 
			case 'L': longitudBarco=1; break; 
			
		}
		
		// pregunto si me sabe sin salirme del panel
		if((f<=FILAS_COLUMNAS-longitudBarco)&&(orientacion==ORIENTACION_VERTICAL)) {
			
			for(int i=0;i<longitudBarco;i++) {
				panel[f+i][c] = tipoBarco;
			}
		}
		// idem: pregunto si cabe en HORIZONTAL y si eso lo coloco
		else if((c<=FILAS_COLUMNAS-longitudBarco)&&(orientacion==ORIENTACION_HORIZONTAL)) {
			
			for(int i=0;i<longitudBarco;i++) {
				panel[f][c+i] = tipoBarco;
			}
		}

		
		// este barco lo coloco en la posicion 0 de los barcos
		// los portaviones siempre van ahí
		Barco barco = new Barco();
		barco.setFila(f);
		barco.setColumna(c);
		barco.setOrientacion(orientacion);
		barco.setTipo(""+tipoBarco);
		
		switch(tipoBarco) {
		
			case 'P': barcos[0]=barco; break; 
			case 'A': barcos[1]=barco; break; 
			case 'S': barcos[2]=barco; break; 
			case 'D': if(barcos[3]==null) barcos[3]=barco; else barcos[4]=barco; break; 
			case 'L': if(barcos[5]==null) barcos[5]=barco; else barcos[6]=barco; break; 
		}
	}	
	
	
	
	
	public int disparo(Tirada tirada) {
		
		int fila = tirada.getFila();
		int columna = tirada.getColumna();
		
		
		char habia = panel[fila][columna];
				
		if(habia=='+') {
			
			return this.DISPARO_AGUA;
		}
		else  {
			
			panel[fila][columna] = '#';
			
			if(hundido(this.BARCOS_PORTAVIONES)) {
				
				return this.DISPARO_HUNDIDO_PORTAVIONES;
			}
			else return this.DISPARO_TOCADO;
		}
	}


	
	



	private boolean hundido(char tipoBarco) {

		int longitudBarco = 0;
		Barco barco = null;
		
		switch(tipoBarco) {
			
			case 'P': longitudBarco=4; barco = barcos[0]; break; 
		}
		
		
		
		int tocados = 0;
		int fila = barco.getFila();
		int columna = barco.getColumna();
		for(int i=0;i<longitudBarco;i++) {
			
			if(barco.getOrientacion()==Juego.ORIENTACION_VERTICAL) {
				
				if(panel[fila+i][columna]=='#') tocados++;
			}
			else if(barco.getOrientacion()==Juego.ORIENTACION_HORIZONTAL) {
				
				if(panel[fila][columna+i]=='#') tocados++;
			}
		}
		
		
		if(tocados==longitudBarco) return true;
		else return false;
	}
	
	
	
	

}
