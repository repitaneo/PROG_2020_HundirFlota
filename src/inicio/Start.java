package inicio;

import juego.Juego;

public class Start {

	public static void main(String[] args) {


		Juego juego = new Juego();
		
		juego.setBarco(2,2,Juego.ORIENTACION_HORIZONTAL,Juego.BARCOS_PORTAVIONES);
		
		juego.setBarco(0,0,Juego.ORIENTACION_HORIZONTAL,Juego.BARCOS_ACORAZADO);
		
		juego.setBarco(5,4,Juego.ORIENTACION_VERTICAL,Juego.BARCOS_SUBMARINO);
		
		
		juego.setBarco(4,6,Juego.ORIENTACION_VERTICAL,Juego.BARCOS_DESTRUCTOR);
		juego.setBarco(2,0,Juego.ORIENTACION_VERTICAL,Juego.BARCOS_DESTRUCTOR);
		
		juego.setBarco(6,1,0,Juego.BARCOS_LANCHA);
		juego.setBarco(0,5,0,Juego.BARCOS_LANCHA);
		
		
		juego.pintarPanel();
		juego.pintarBarcos();
		

	}

}
