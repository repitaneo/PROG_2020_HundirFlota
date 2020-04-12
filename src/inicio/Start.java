package inicio;

import juego.Juego;

public class Start {

	public static void main(String[] args) {


		Juego juego = new Juego();
		
		juego.setPortaviones(2, 2, Juego.ORIENTACION_HORIZONTAL);
		
		juego.setAcorazado(0, 0, Juego.ORIENTACION_HORIZONTAL);
		
		juego.setSubmarino(5, 4, Juego.ORIENTACION_VERTICAL);
		
		
		juego.setDestructor(4, 6, Juego.ORIENTACION_VERTICAL);
		juego.setDestructor(2, 0, Juego.ORIENTACION_VERTICAL);
		
		juego.setLancha(6, 1);
		juego.setLancha(0, 5);
		
		juego.pintarPanel();
		

	}

}
