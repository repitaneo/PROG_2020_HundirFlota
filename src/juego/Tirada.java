package juego;

public class Tirada {

	private int fila;
	private int columna;
	
	
	
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	@Override
	public String toString() {
		return "Tirada [fila=" + fila + ", columna=" + columna + "]";
	}
	
	
	
	
}
