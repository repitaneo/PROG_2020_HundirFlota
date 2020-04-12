package juego;

public class Contrincante {


	
	
	public Tirada nuevoIntento() {
		
		int fila = (int)(Math.random()*Juego.FILAS_COLUMNAS);
		int columna = (int)(Math.random()*Juego.FILAS_COLUMNAS);
		
		Tirada tirada = new Tirada();
		tirada.setFila(fila);
		tirada.setColumna(columna);
		
		return tirada;
	}
}
