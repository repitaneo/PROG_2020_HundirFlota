package juego;

public class Barco {

	private int fila;
	private int columna;
	private String tipo;
	private int orientacion;
	
	
	
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(int orientacion) {
		this.orientacion = orientacion;
	}
	@Override
	public String toString() {
		return "Barco [fila=" + fila + ", columna=" + columna + ", tipo=" + tipo + ", orientacion=" + orientacion + "]";
	}
	
	
	
	
	
	
}
